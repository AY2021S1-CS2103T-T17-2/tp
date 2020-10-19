package seedu.flashcard.storage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import seedu.flashcard.commons.exceptions.IllegalValueException;
import seedu.flashcard.model.flashcard.Answer;
import seedu.flashcard.model.flashcard.Category;
import seedu.flashcard.model.flashcard.Flashcard;
import seedu.flashcard.model.flashcard.Note;
import seedu.flashcard.model.flashcard.Question;
/**
 * Jackson-friendly version of {@link Flashcard}.
 */
class JsonAdaptedFlashcard {

    public static final String MISSING_FIELD_MESSAGE_FORMAT = "Flashcard's %s field is missing!";

    private String question;
    private String answer;
    private String category;
    private String note;
<<<<<<< HEAD
<<<<<<< HEAD
    private String isFavourite;
=======
>>>>>>> 9017367472fa4f41b4a98df6fe9fce464d0665cc
=======
    private String isFavourite;
>>>>>>> a0c2543950d1f964337e501d3b72869eb9c2b8d8

    /**
     * Constructs a {@code JsonAdaptedFlashcard} with the given flashcard details.
     */
    @JsonCreator
    public JsonAdaptedFlashcard(@JsonProperty("question") String question, @JsonProperty("answer") String answer,
<<<<<<< HEAD
<<<<<<< HEAD
                                @JsonProperty("category") String category, @JsonProperty("note") String note,
                                @JsonProperty("favourite") String isFavourite) {
=======
                                @JsonProperty("category") String category, @JsonProperty("note") String note) {
>>>>>>> 9017367472fa4f41b4a98df6fe9fce464d0665cc
=======
                                @JsonProperty("category") String category, @JsonProperty("note") String note,
                                @JsonProperty("favourite") String isFavourite) {
>>>>>>> a0c2543950d1f964337e501d3b72869eb9c2b8d8
        this.question = question;
        this.answer = answer;
        this.category = category;
        this.note = note;
<<<<<<< HEAD
<<<<<<< HEAD
        this.isFavourite = isFavourite;
=======
>>>>>>> 9017367472fa4f41b4a98df6fe9fce464d0665cc
=======
        this.isFavourite = isFavourite;
>>>>>>> a0c2543950d1f964337e501d3b72869eb9c2b8d8
    }

    /**
     * Converts a given {@code Flashcard} into this class for Jackson use.
     */
    public JsonAdaptedFlashcard(Flashcard source) {
        question = source.getQuestion().toString();
        answer = source.getAnswer().toString();
        category = source.getCategory().toString();
        note = source.getNote().toString();
<<<<<<< HEAD
<<<<<<< HEAD
        isFavourite = Boolean.toString(source.isFavourite());
=======
>>>>>>> 9017367472fa4f41b4a98df6fe9fce464d0665cc
=======
        isFavourite = Boolean.toString(source.isFavourite());
>>>>>>> a0c2543950d1f964337e501d3b72869eb9c2b8d8
    }

    /**
     * Converts this Jackson-friendly adapted flashcard object into the model's {@code Flashcard} object.
     *
     * @throws IllegalValueException if there were any data constraints violated in the adapted flashcard.
     */
    public Flashcard toModelType() throws IllegalValueException {
        if (question == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT,
                    Question.class.getSimpleName()));
        }
        if (!Question.isValidQuestion(question)) {
            throw new IllegalValueException(Question.MESSAGE_CONSTRAINTS);
        }
        final Question modelQuestion = new Question(question);

        if (answer == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT,
                    Answer.class.getSimpleName()));
        }
        if (!Answer.isValidAnswer(answer)) {
            throw new IllegalValueException(Answer.MESSAGE_CONSTRAINTS);
        }
        final Answer modelAnswer = new Answer(answer);

        if (category == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT,
                    Category.class.getSimpleName()));
        }
        if (!Category.isValidCategory(category)) {
            throw new IllegalValueException(Category.MESSAGE_CONSTRAINTS);
        }
        final Category modelCategory = new Category(category);

        if (note == null) {
            throw new IllegalValueException(String.format(MISSING_FIELD_MESSAGE_FORMAT,
                    Note.class.getSimpleName()));
        }
        final Note modelNote = new Note(note);

<<<<<<< HEAD
<<<<<<< HEAD
        final Boolean modelIsFavourite = Boolean.parseBoolean(isFavourite);

        return new Flashcard(modelQuestion, modelAnswer, modelCategory, modelNote, modelIsFavourite);
=======
        return new Flashcard(modelQuestion, modelAnswer, modelCategory, modelNote);
>>>>>>> 9017367472fa4f41b4a98df6fe9fce464d0665cc
=======
        final Boolean modelIsFavourite = Boolean.parseBoolean(isFavourite);

        return new Flashcard(modelQuestion, modelAnswer, modelCategory, modelNote, modelIsFavourite);
>>>>>>> a0c2543950d1f964337e501d3b72869eb9c2b8d8
    }

}
