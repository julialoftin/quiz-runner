package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class TrueFalse extends Question {
    private String correctAnswer;
    private String userAnswer;

    public TrueFalse(String question, String correctAnswer) {
        super(question);
        this.correctAnswer = correctAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    //TODO: Make method to display question
    @Override
    public void displayQuestion() {
        String question = super.getQuestion();
        Scanner input = new Scanner(System.in);
        System.out.println(question + " (T/F)");
        userAnswer = input.nextLine();
    }

    //TODO: Make method to compare answer with correct answer
    @Override
    public void gradeQuestion() {
        String correct = "Correct!";
        String incorrect = "Incorrect!";
        String grade = (userAnswer.toUpperCase().equals(correctAnswer.toUpperCase()) ? correct : incorrect);
        System.out.println(grade + System.lineSeparator());
    }

}
