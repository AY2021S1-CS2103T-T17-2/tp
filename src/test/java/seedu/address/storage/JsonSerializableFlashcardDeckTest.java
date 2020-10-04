package seedu.address.storage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static seedu.address.testutil.Assert.assertThrows;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.commons.util.JsonUtil;
import seedu.address.model.FlashcardDeck;
import seedu.address.testutil.TypicalFlashcards;

public class JsonSerializableFlashcardDeckTest {

    private static final Path TEST_DATA_FOLDER = Paths.get("src", "test", "data",
            "JsonSerializableFlashcardDeckTest");
    private static final Path TYPICAL_FLASHCARDS_FILE = TEST_DATA_FOLDER.resolve("typicalFlashcardsFlashcardDeck.json");
    private static final Path DUPLICATE_FLASHCARDS_FILE = TEST_DATA_FOLDER
            .resolve("duplicateFlashcardsFlashcardDeck.json");
    private static final Path INVALID_FLASHCARD_FILE = TEST_DATA_FOLDER.resolve("invalidFlashCardFlashcardDeck.json");

    @Test
    public void toModelType_typicalFlashcardsFile_success() throws Exception {
        JsonSerializableFlashcardDeck dataFromFile = JsonUtil.readJsonFile(TYPICAL_FLASHCARDS_FILE,
                JsonSerializableFlashcardDeck.class).get();
        FlashcardDeck flashcardDeckFromFile = dataFromFile.toModelType();
        FlashcardDeck typicalFlashcardDeck = TypicalFlashcards.getTypicalFlashcardDeck();
        assertEquals(flashcardDeckFromFile, typicalFlashcardDeck);
    }

    @Test
    public void toModelType_duplicateFlashcards_throwsIllegalValueException() throws Exception {
        JsonSerializableFlashcardDeck dataFromFile = JsonUtil.readJsonFile(DUPLICATE_FLASHCARDS_FILE,
                JsonSerializableFlashcardDeck.class).get();
        assertThrows(IllegalValueException.class, JsonSerializableFlashcardDeck.MESSAGE_DUPLICATE_FLASHCARD,
                dataFromFile::toModelType);
    }

    @Test
    public void toModelType_invalidFlashcardFile_throwsIllegalValueException() throws Exception {
        JsonSerializableFlashcardDeck dataFromFile = JsonUtil.readJsonFile(INVALID_FLASHCARD_FILE,
                JsonSerializableFlashcardDeck.class).get();
        assertThrows(IllegalValueException.class, dataFromFile::toModelType);
    }
}
