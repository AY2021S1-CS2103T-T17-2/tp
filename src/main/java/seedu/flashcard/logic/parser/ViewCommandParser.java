package seedu.flashcard.logic.parser;

import static seedu.flashcard.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.flashcard.logic.parser.CliSyntax.PREFIX_ANSWER;
import static seedu.flashcard.logic.parser.CliSyntax.PREFIX_CATEGORY;
import static seedu.flashcard.logic.parser.CliSyntax.PREFIX_DIAGRAM;
import static seedu.flashcard.logic.parser.CliSyntax.PREFIX_NOTE;
import static seedu.flashcard.logic.parser.CliSyntax.PREFIX_QUESTION;
import static seedu.flashcard.logic.parser.CliSyntax.PREFIX_RATING;

import seedu.flashcard.commons.core.index.Index;
import seedu.flashcard.logic.commands.DeleteCommand;
import seedu.flashcard.logic.commands.ViewCommand;
import seedu.flashcard.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new ViewCommand object
 */
public class ViewCommandParser implements Parser<ViewCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the ViewCommand
     * and returns a VieweCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public ViewCommand parse(String args) throws ParseException {
        Index index;
        ArgumentMultimap argMultimap =
                ArgumentTokenizer.tokenize(args, PREFIX_ANSWER);

        try {
            index = ParserUtil.parseIndex(argMultimap.getPreamble());

        } catch (ParseException pe) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, ViewCommand.MESSAGE_USAGE), pe);
        }

        if (argMultimap.getValue(PREFIX_ANSWER).isPresent()) {
            return new ViewCommand(index, true);
        } else {
            return new ViewCommand(index, false);
        }
    }

}
