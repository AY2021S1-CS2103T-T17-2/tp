---
layout: page
title: Kimberly's Project Portfolio Page
---

## Project: SWEe!

SWEe! is a desktop application used for managing CS2103T learning progress mainly through flashcards. The user interacts with it using a CLI, and it has a GUI created with JavaFX. It is written in Java, and has about 10 kLoC.

Given below are my contributions to the project.

* **Code contributed**: [RepoSense Link](https://nus-cs2103-ay2021s1.github.io/tp-dashboard/#breakdown=true&search=kimberlyohq)

* **Enhancements implemented**:
    1. Refactored `Person` to `Flashcard` [#26](https://github.com/AY2021S1-CS2103T-T17-2/tp/pull/26)
    2. Added test cases for `review` command - `ReviewCommandTest`
    3. Added test cases for `StudyManager` - `StudyManagerTest`
    4. Added the ability to favourite and unfavourite flashcards [#73](https://github.com/AY2021S1-CS2103T-T17-2/tp/pull/73) + [#92](https://github.com/AY2021S1-CS2103T-T17-2/tp/pull/92)
        * What it does: Allows the user to favourite and unfavourite flashcards via `fav` and `unfav` command
        * Justification: This feature improves the product significantly especially in terms of user experience as it allows users to favourite flashcards. This allow users to better customize the flashcards, providing greater room for filtering flashcards to refine their list of flashcards, which will be especially helpful in the future when they have a lot of flashcards.
        * Highlights: This enhancement involves adding new commands(`fav` and `unfav`) and updating UI for favourite feature.
    5. Added the ability to find flashcards using keywords
        * What it does: Allows the user to find flashcards using keywords via the `find` command
        * Justification: This feature improves the product significantly in terms of efficiency as it allows users to find flashcards easily.
        * Highlights: This enhancement affected the existing implementation of `find` command in AB3. This is because the `find` searches for the keywords in the entire flashcard, which includes `Flashcard`'s `Question`, `Answer`, `Category`, `Tags` and `Note`
                      as compared to the previous implementation which only looks at `Person#Name`. Since the flashcard can contain special characters, the implementation also includes handling of special characters while searching for matching keywords in flashcard


* **Contributions to User Guide:**:
    * Added documentation for `find` command [#100](https://github.com/AY2021S1-CS2103T-T17-2/tp/pull/100)
    * Added documentation for `fav` commmand [#82](https://github.com/AY2021S1-CS2103T-T17-2/tp/pull/82)
    * Added documentation for `unfav` command [#82](https://github.com/AY2021S1-CS2103T-T17-2/tp/pull/82)
    * Added documentation for `clear` command [#159](https://github.com/AY2021S1-CS2103T-T17-2/tp/pull/159)
* **Contributions to DG:**:
    * Refactored DG from AB3 to SWEe! [#108](https://github.com/AY2021S1-CS2103T-T17-2/tp/pull/108)
        * Updated UML diagrams:
            * Sequence Diagrams: `ArchitectureSequenceDiagram`, `DeleteSequenceDiagram`, `LogicSequenceDiagram`
            * Class Diagrams: `BetterModelClassDiagram`, `LogicClassDiagram`, `ModelClassDiagram`, `StorageClassDiagram`, `UiClassDiagram`
            * Activity Diagrams: `CommitActivityDiagram`
    * Added implementation details for `fav/unfav` feature [#77](https://github.com/AY2021S1-CS2103T-T17-2/tp/pull/77)
        * Added UML diagrams: `FavouriteSequenceDiagram`, `UnfavouriteSequenceDiagram`, `FavouriteUnfavouriteSequenceDiagram`

* **Contributions to team-based tasks:**:
    * Maintaining the issue-tracker
    * Refactoring DG from AB3 to SWEe!

* **Review/Mentoring Contributions**:

* **Contributions beyond project team**:
