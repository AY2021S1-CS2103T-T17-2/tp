package seedu.flashcard.testutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.flashcard.model.FlashcardDeck;
import seedu.flashcard.model.flashcard.Flashcard;

/**
 * A utility class containing a list of {@code Flashcard} objects to be used in tests.
 */
public class TypicalFlashcards {

    public static final Flashcard FLASHCARD_1 = new FlashcardBuilder().withQuestion("What does SDLC stand for?")
<<<<<<< HEAD
<<<<<<< HEAD
            .withAnswer("Software development life cycle").withCategory("SDLC").withFavouriteStatus(false)
=======
            .withAnswer("Software development life cycle").withCategory("SDLC")
>>>>>>> 9017367472fa4f41b4a98df6fe9fce464d0665cc
=======
            .withAnswer("Software development life cycle").withCategory("SDLC").withFavouriteStatus(false)
>>>>>>> a0c2543950d1f964337e501d3b72869eb9c2b8d8
            .build();

    public static final Flashcard FLASHCARD_2 = new FlashcardBuilder()
            .withQuestion("What is a revision control software?")
            .withAnswer("It is the software tool that automate the process of Revision Control")
<<<<<<< HEAD
<<<<<<< HEAD
            .withCategory("Revision History").withFavouriteStatus(true)
=======
            .withCategory("Revision History")
>>>>>>> 9017367472fa4f41b4a98df6fe9fce464d0665cc
=======
            .withCategory("Revision History").withFavouriteStatus(true)
>>>>>>> a0c2543950d1f964337e501d3b72869eb9c2b8d8
            .build();

    public static final Flashcard FLASHCARD_3 = new FlashcardBuilder()
            .withQuestion("It is recommended that assertions to be used liberally in the code. True or False?")
            .withAnswer("True").build();

    private TypicalFlashcards() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical flashcards.
     */
    public static FlashcardDeck getTypicalFlashcardDeck() {
        FlashcardDeck ab = new FlashcardDeck();
        for (Flashcard flashcard : getTypicalFlashcards()) {
            ab.addFlashcard(flashcard);
        }
        return ab;
    }

    public static List<Flashcard> getTypicalFlashcards() {
        return new ArrayList<>(Arrays.asList(FLASHCARD_1, FLASHCARD_2, FLASHCARD_3));
    }
}
