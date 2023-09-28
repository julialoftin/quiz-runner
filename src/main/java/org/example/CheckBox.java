package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckBox extends MultipleChoice {
    private ArrayList<String> correctAnswers = new ArrayList<>();
    private ArrayList<String> possibleAnswers = new ArrayList<>();
    private ArrayList<String> userAnswers = new ArrayList<>();

    // TODO: Make constructor
    public CheckBox(String question, ArrayList<String> correctAnswers, ArrayList<String> possibleAnswers) {
        super(question, correctAnswer);
        this.question = question;
        this.correctAnswers = correctAnswers;
        this.possibleAnswers = possibleAnswers;
    }

    // TODO: Make method to display question
    public void displayQuestion() {
        System.out.println("Type all that apply separated by new lines: " + question);
    }

    // TODO: Make method to display possible answers
    public void displayPossibleAnswers() {
        System.out.print(possibleAnswers.get(0) + System.lineSeparator() + possibleAnswers.get(1) +
                System.lineSeparator() + possibleAnswers.get(2) + System.lineSeparator() + possibleAnswers.get(3) +
                System.lineSeparator());
        while(true) {
            Scanner input = new Scanner(System.in);
            String userAnswer = input.nextLine();
            if (userAnswer.isEmpty()) {
                break;
            }
            userAnswers.add(userAnswer);
        }
    }

    // TODO: Make method to compare answers with correct answers
    public void gradeQuestion() {
        String correct = "Correct!";
        String incorrect = "Incorrect!";
        int count = 0;
        for (String correctAnswer : correctAnswers) {
            for (String userAnswer : userAnswers) {
//                String grade = (userAnswer.toUpperCase().equals(correctAnswer.toUpperCase()) ? correct : incorrect);
                if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                    count += 1;
                }
            }
        }
        System.out.println(count + "/" + correctAnswers.size() + " correct!");
    }

}
