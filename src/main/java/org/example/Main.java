package org.example;

import java.util.ArrayList;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {
        TrueFalse cats = new TrueFalse("Are cats real?", "F");
        cats.displayQuestion();
        cats.gradeQuestion();

        MultipleChoice missouriCapital = new MultipleChoice("What is the capital of Missouri?",
                "Jefferson City", new ArrayList<>(asList("St Louis", "Jefferson City", "Kansas City", "St Charles")));
        missouriCapital.displayQuestion();
        missouriCapital.displayPossibleAnswers();
        missouriCapital.gradeQuestion();

        CheckBox gilmoreGirlsChars = new CheckBox("Which characters are in Gilmore Girls?",
                new ArrayList<>(asList("Rory", "Lorelai")), new ArrayList<>(asList("Sara", "Lorelai", "Robert", "Rory")));
        gilmoreGirlsChars.displayQuestion();
        gilmoreGirlsChars.displayPossibleAnswers();
        gilmoreGirlsChars.gradeQuestion();
    }
}