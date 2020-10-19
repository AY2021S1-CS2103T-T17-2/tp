package seedu.flashcard.testutil;

import seedu.flashcard.model.flashcard.Answer;
import seedu.flashcard.model.flashcard.Category;
import seedu.flashcard.model.flashcard.Flashcard;
import seedu.flashcard.model.flashcard.Note;
import seedu.flashcard.model.flashcard.Question;

/**
 * A utility class to help with building Person objects.
 */
public class FlashcardBuilder {

    public static final String DEFAULT_QUESTION = "What does OOP stand for?";
    public static final String DEFAULT_ANSWER = "Object oriented programming";
    public static final String DEFAULT_CATEGORY = "General";
    public static final String DEFAULT_NOTE = "";
<<<<<<< HEAD
    public static final boolean DEFAULT_FAVOURITE_STATUS = false;
=======
>>>>>>> 9017367472fa4f41b4a98df6fe9fce464d0665cc

    private Question question;
    private Answer answer;
    private Category category;
    private Note note;
<<<<<<< HEAD
    private boolean isFavourite;
=======
>>>>>>> 9017367472fa4f41b4a98df6fe9fce464d0665cc

    /**
     * Creates a {@code FlashcardBuilder} with the default details.
     */
    public FlashcardBuilder() {
        question = new Question(DEFAULT_QUESTION);
        answer = new Answer(DEFAULT_ANSWER);
        category = new Category(DEFAULT_CATEGORY);
        note = new Note(DEFAULT_NOTE);
<<<<<<< HEAD
        isFavourite = DEFAULT_FAVOURITE_STATUS;
=======
>>>>>>> 9017367472fa4f41b4a98df6fe9fce464d0665cc
    }

    /**
     * Initializes the FlashcardBuilder with the data of {@code flashcardToCopy}.
     */
    public FlashcardBuilder(Flashcard flashcardToCopy) {
        question = flashcardToCopy.getQuestion();
        answer = flashcardToCopy.getAnswer();
        category = flashcardToCopy.getCategory();
        note = flashcardToCopy.getNote();
<<<<<<< HEAD
        isFavourite = flashcardToCopy.isFavourite();
=======
>>>>>>> 9017367472fa4f41b4a98df6fe9fce464d0665cc
    }

    /**
     * Sets the {@code Question} of the {@code Flashcard} that we are building.
     */
    public FlashcardBuilder withQuestion(String question) {
        this.question = new Question(question);
        return this;
    }

    /**
     * Sets the {@code Answer} of the {@code Flashcard} that we are building.
     */
    public FlashcardBuilder withAnswer(String answer) {
        this.answer = new Answer(answer);
        return this;
    }

    /**
     * Sets the {@code Category} of the {@code Flashcard} that we are building.
     */
    public FlashcardBuilder withCategory(String category) {
        this.category = new Category(category);
        return this;
    }

    /**
     * Sets the {@code Note} of the {@code Flashcard} that we are building.
     */
    public FlashcardBuilder withNote(String note) {
        this.note = new Note(note);
        return this;
    }

<<<<<<< HEAD
    /**
     * Sets the {@code isFavourite} status of the {@code Flashcard} that we are building.
     */
    public FlashcardBuilder withFavouriteStatus(boolean isFavourite) {
        this.isFavourite = isFavourite;
        return this;
    }

    public Flashcard build() {
        return new Flashcard(question, answer, category, note, isFavourite);
=======
    public Flashcard build() {
        return new Flashcard(question, answer, category, note);
>>>>>>> 9017367472fa4f41b4a98df6fe9fce464d0665cc
    }

}