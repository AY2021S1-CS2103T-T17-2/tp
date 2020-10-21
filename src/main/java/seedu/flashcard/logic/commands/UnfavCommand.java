package seedu.flashcard.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.flashcard.model.Model.PREDICATE_SHOW_ALL_FLASHCARDS;

import java.util.List;
import java.util.Set;

import seedu.flashcard.commons.core.Messages;
import seedu.flashcard.commons.core.index.Index;
import seedu.flashcard.logic.commands.exceptions.CommandException;
import seedu.flashcard.model.Model;
import seedu.flashcard.model.flashcard.Answer;
import seedu.flashcard.model.flashcard.Category;
import seedu.flashcard.model.flashcard.Diagram;
import seedu.flashcard.model.flashcard.Flashcard;
import seedu.flashcard.model.flashcard.Note;
import seedu.flashcard.model.flashcard.Question;
import seedu.flashcard.model.flashcard.Rating;
import seedu.flashcard.model.tag.Tag;

/**
 * Unfavourite a flashcard identified using it's displayed index from the list of flashcards.
 */
public class UnfavCommand extends Command {

    public static final String COMMAND_WORD = "unfav";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Unfavourite the flashcard identified by the index number used in the displayed flashcard list.\n"
            + "Parameters: INDEX (must be a positive integer)\n"
            + "Example: " + COMMAND_WORD + " 1";

    public static final String MESSAGE_UNFAVOURITE_FLASHCARD_SUCCESS = "Unfavourite Flashcard: %1$s";

    private final Index targetIndex;

    public UnfavCommand(Index targetIndex) {
        this.targetIndex = targetIndex;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        List<Flashcard> lastShownList = model.getFilteredFlashcardList();

        if (targetIndex.getZeroBased() >= lastShownList.size()) {
            throw new CommandException(Messages.MESSAGE_INVALID_FLASHCARD_DISPLAYED_INDEX);
        }

        Flashcard flashcardToUnfavourite = lastShownList.get(targetIndex.getZeroBased());
        assert flashcardToUnfavourite != null : "Index is invalid";


        if (!flashcardToUnfavourite.isFavourite()) {
            return new CommandResult(String.format(MESSAGE_UNFAVOURITE_FLASHCARD_SUCCESS, flashcardToUnfavourite));
        }

        Flashcard unfavouredFlashcard = createUnfavouriteFlashcard(flashcardToUnfavourite);
        model.setFlashcard(flashcardToUnfavourite, unfavouredFlashcard);
        model.updateFilteredFlashcardList(PREDICATE_SHOW_ALL_FLASHCARDS);
        return new CommandResult(String.format(MESSAGE_UNFAVOURITE_FLASHCARD_SUCCESS, unfavouredFlashcard));
    }

    private static Flashcard createUnfavouriteFlashcard(Flashcard flashcardToUnfavourite) {

        Question question = flashcardToUnfavourite.getQuestion();
        Answer answer = flashcardToUnfavourite.getAnswer();
        Category category = flashcardToUnfavourite.getCategory();
        Note note = flashcardToUnfavourite.getNote();
        Rating rating = flashcardToUnfavourite.getRating();
        Set<Tag> tags = flashcardToUnfavourite.getTags();
        Diagram diagram = flashcardToUnfavourite.getDiagram();
        return new Flashcard(question, answer, category, note, rating,tags, diagram, false);
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof UnfavCommand // instanceof handles nulls
                && targetIndex.equals(((UnfavCommand) other).targetIndex)); // state check
    }
}
