package seedu.address.logic.commands;

/**
 * Contains integration tests (interaction with the Model, UndoCommand and RedoCommand) and unit tests for
 * {@code DeleteCommand}.
 */
public class DeleteCommandTest {

//    private Model model = new ModelManager(getTypicalAddressBook(), new UserPrefs());
//
//    @Test
//    public void execute_validIndexUnfilteredList_success() {
//        Flashcard flashcardToDelete = model.getFilteredPersonList().get(INDEX_FIRST_PERSON.getZeroBased());
//        DeleteCommand deleteCommand = new DeleteCommand(INDEX_FIRST_PERSON);
//
//        String expectedMessage = String.format(DeleteCommand.MESSAGE_DELETE_PERSON_SUCCESS, flashcardToDelete);
//
//        ModelManager expectedModel = new ModelManager(model.getAddressBook(), new UserPrefs());
//        expectedModel.deleteFlashcard(flashcardToDelete);
//
//        assertCommandSuccess(deleteCommand, model, expectedMessage, expectedModel);
//    }
//
//    @Test
//    public void execute_invalidIndexUnfilteredList_throwsCommandException() {
//        Index outOfBoundIndex = Index.fromOneBased(model.getFilteredPersonList().size() + 1);
//        DeleteCommand deleteCommand = new DeleteCommand(outOfBoundIndex);
//
//        assertCommandFailure(deleteCommand, model, Messages.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX);
//    }
//
//    @Test
//    public void execute_validIndexFilteredList_success() {
//        showPersonAtIndex(model, INDEX_FIRST_PERSON);
//
//        Flashcard flashcardToDelete = model.getFilteredPersonList().get(INDEX_FIRST_PERSON.getZeroBased());
//        DeleteCommand deleteCommand = new DeleteCommand(INDEX_FIRST_PERSON);
//
//        String expectedMessage = String.format(DeleteCommand.MESSAGE_DELETE_PERSON_SUCCESS, flashcardToDelete);
//
//        Model expectedModel = new ModelManager(model.getAddressBook(), new UserPrefs());
//        expectedModel.deleteFlashcard(flashcardToDelete);
//        showNoPerson(expectedModel);
//
//        assertCommandSuccess(deleteCommand, model, expectedMessage, expectedModel);
//    }
//
//    @Test
//    public void execute_invalidIndexFilteredList_throwsCommandException() {
//        showPersonAtIndex(model, INDEX_FIRST_PERSON);
//
//        Index outOfBoundIndex = INDEX_SECOND_PERSON;
//        // ensures that outOfBoundIndex is still in bounds of address book list
//        assertTrue(outOfBoundIndex.getZeroBased() < model.getAddressBook().getFlashcardList().size());
//
//        DeleteCommand deleteCommand = new DeleteCommand(outOfBoundIndex);
//
//        assertCommandFailure(deleteCommand, model, Messages.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX);
//    }
//
//    @Test
//    public void equals() {
//        DeleteCommand deleteFirstCommand = new DeleteCommand(INDEX_FIRST_PERSON);
//        DeleteCommand deleteSecondCommand = new DeleteCommand(INDEX_SECOND_PERSON);
//
//        // same object -> returns true
//        assertTrue(deleteFirstCommand.equals(deleteFirstCommand));
//
//        // same values -> returns true
//        DeleteCommand deleteFirstCommandCopy = new DeleteCommand(INDEX_FIRST_PERSON);
//        assertTrue(deleteFirstCommand.equals(deleteFirstCommandCopy));
//
//        // different types -> returns false
//        assertFalse(deleteFirstCommand.equals(1));
//
//        // null -> returns false
//        assertFalse(deleteFirstCommand.equals(null));
//
//        // different person -> returns false
//        assertFalse(deleteFirstCommand.equals(deleteSecondCommand));
//    }
//
//    /**
//     * Updates {@code model}'s filtered list to show no one.
//     */
//    private void showNoPerson(Model model) {
//        model.updateFilteredPersonList(p -> false);
//
//        assertTrue(model.getFilteredPersonList().isEmpty());
//    }
}
