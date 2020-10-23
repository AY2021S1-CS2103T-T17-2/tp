package seedu.flashcard.logic.commands;

import static java.util.Objects.requireNonNull;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import seedu.flashcard.commons.core.Messages;
import seedu.flashcard.model.Model;
import seedu.flashcard.model.flashcard.AnswerContainsKeywordsPredicate;
import seedu.flashcard.model.flashcard.CategoryContainsKeywordsPredicate;
import seedu.flashcard.model.flashcard.Flashcard;
import seedu.flashcard.model.flashcard.NoteContainsKeywordsPredicate;
import seedu.flashcard.model.flashcard.QuestionContainsKeywordsPredicate;

/**
 * Finds and lists all flashcards in flashcard deck who contains any of the argument keywords.
 * Keyword matching is case insensitive.
 */
public class FindCommand extends Command {

    public static final String COMMAND_WORD = "find";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Finds all flashcards whose flashcards contain any of "
            + "the specified keywords (case-insensitive) and displays them as a list with index numbers.\n"
            + "Parameters: KEYWORD [MORE_KEYWORDS]...\n"
            + "Example: " + COMMAND_WORD + " oop";

    private final List<String> keywords;

    public FindCommand(List<String> keywords) {
        this.keywords = keywords;
    }

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);

        QuestionContainsKeywordsPredicate questionPredicate = new QuestionContainsKeywordsPredicate(keywords);
        AnswerContainsKeywordsPredicate answerPredicate = new AnswerContainsKeywordsPredicate(keywords);
        CategoryContainsKeywordsPredicate categoryPredicate = new CategoryContainsKeywordsPredicate(keywords);
        NoteContainsKeywordsPredicate notePredicate = new NoteContainsKeywordsPredicate(keywords);

        List<Predicate<Flashcard>> listOfPredicates = Arrays.asList(questionPredicate, answerPredicate,
                categoryPredicate, notePredicate);
        Predicate<Flashcard> predicates = listOfPredicates.stream().reduce(Predicate::or).orElse(x->false);
        model.updateFilteredFlashcardList(predicates);

        return new CommandResult(
                String.format(Messages.MESSAGE_FLASHCARDS_LISTED_OVERVIEW, model.getFilteredFlashcardList().size()));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof FindCommand // instanceof handles nulls
                && keywords.equals(((FindCommand) other).keywords)); // state check
    }
}
