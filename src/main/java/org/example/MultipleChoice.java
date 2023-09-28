package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends TrueFalse {
    private String correctAnswer = super.getCorrectAnswer();
    private ArrayList<String> possibleAnswers = new ArrayList<>();
    private String userAnswer = super.getUserAnswer();

    //TODO: Make constructor
    public MultipleChoice(String question, String correctAnswer, ArrayList<String> possibleAnswers) {
        super(question, correctAnswer);
        this.possibleAnswers = possibleAnswers;
    }

    // TODO: Make method to display question
    @Override
    public void displayQuestion() {
        String question = super.getQuestion();
        System.out.println(question);
    }

    // TODO: Make method to display possible answers
    public void displayPossibleAnswers() {
        System.out.print(possibleAnswers.get(0) + System.lineSeparator() + possibleAnswers.get(1) +
                System.lineSeparator() + possibleAnswers.get(2) + System.lineSeparator() + possibleAnswers.get(3) +
                System.lineSeparator());
        Scanner input = new Scanner(System.in);
        userAnswer = input.nextLine();
    }

    // TODO: Make method to compare answer with correct answer
    @Override
    public void gradeQuestion() {
        String correct = "Correct!";
        String incorrect = "Incorrect!";
        String grade = (userAnswer.toUpperCase().equals(correctAnswer.toUpperCase()) ? correct : incorrect);
        System.out.println(grade + System.lineSeparator());
    }

}
