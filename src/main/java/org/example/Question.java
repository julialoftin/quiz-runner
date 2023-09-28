package org.example;

import java.util.Scanner;

public abstract class Question {
    private String question;
    private Scanner input;

    public Question(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public abstract void displayQuestion();
    public abstract void gradeQuestion();
}
