package seedu.flashcard.model.flashcard;

import seedu.flashcard.model.tag.Tag;

import static seedu.flashcard.commons.util.CollectionUtil.requireAllNonNull;

import java.util.Objects;

/**
 * Represents a Flashcard in the flashcard list.
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class Flashcard {

    // Identity fields
    private final Question question;

    // Data fields
    private final Answer answer;
    private final Category category;
    private final Note note;
    private final Rating rating;
    private final Tag tag;

    // State fields
    private final boolean isFavourite;

    /**
     * Identity and Data fields must be present and not null.
     */
    public Flashcard(Question question, Answer answer, Category category, Note note, Rating rating, Tag tag) {
        requireAllNonNull(question, answer, category, note, rating, tag);
        this.question = question;
        this.answer = answer;
        this.category = category;
        this.note = note;
        this.rating = rating;
        this.tag = tag;
        this.isFavourite = false;
    }

    /**
     * Overloaded constructor for creating a flashcard when flashcard is favourited/unfavourited.
     * All fields must be present and not null.
     */
    public Flashcard(Question question, Answer answer, Category category, Note note, Rating rating, Tag tag,
                     boolean isFavourite) {
        requireAllNonNull(question, answer, category, note, rating, isFavourite);
        this.question = question;
        this.answer = answer;
        this.category = category;
        this.note = note;
        this.rating = rating;
        this.tag = tag;
        this.isFavourite = isFavourite;
    }

    public Question getQuestion() {
        return question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public Category getCategory() {
        return category;
    }

    public Note getNote() {
        return note;
    }

    public Rating getRating() {
        return rating;
    }

    public Tag getTag() {
        return tag;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    /**
     * Returns true if the input is the correct answer.
     */
    public boolean isCorrect(String inputAnswer) {
        return answer.toString().equals(inputAnswer);
    }

    /**
     * Returns true if both flashcards have the same question.
     * This defines a weaker notion of equality between two flashcards.
     */
    public boolean isSameQuestion(Flashcard otherFlashcard) {
        if (otherFlashcard == this) {
            return true;
        }

        return otherFlashcard != null
                && otherFlashcard.getQuestion().equals(getQuestion());
    }

    /**
     * Returns true if both flashcards have the same identity and data fields.
     * This defines a stronger notion of equality between two flashcards.
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Flashcard)) {
            return false;
        }

        Flashcard otherFlashcard = (Flashcard) other;

        return otherFlashcard.getQuestion().equals(getQuestion())
                && otherFlashcard.getAnswer().equals(getAnswer())
                && otherFlashcard.getCategory().equals(getCategory())
                && otherFlashcard.getNote().equals(getNote())
                && otherFlashcard.getRating().equals(getRating())
                && otherFlashcard.getTag().equals(getTag())
                && otherFlashcard.isFavourite() == isFavourite();
    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(question, answer, category, note, rating, isFavourite);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(" Category: ")
                .append(getCategory())
                .append(" Question: ")
                .append(getQuestion())
                .append(" Answer: ")
                .append(getAnswer());
        if (getNote().toString().length() > 0) {
            builder.append(" Note: ")
                    .append(getNote());
        }
        if (getRating().toString().length() > 0) {
            builder.append(" Rating: ")
                    .append(getRating());
        }
        if (getTag().getTagName().length() > 0) {
            builder.append(" Tag: ")
                    .append(getTag());
        }
        builder.append(" Favourite: ")
                .append(isFavourite());
        return builder.toString();
    }

}
