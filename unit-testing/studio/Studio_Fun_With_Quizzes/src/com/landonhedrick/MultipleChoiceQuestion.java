package com.landonhedrick;

import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question {

    ArrayList<String> answers = new ArrayList<>();

    public MultipleChoiceQuestion(String question, String correctAnswer, ArrayList<String> answers) {
        super(question, correctAnswer);
        this.answers = answers;
    }

//    @Override
//    public String toString() {
//
//        String str;
//
//        for (String a : answers) {
//
//        }
//
//        return getQuestion() + System.lineSeparator() +
//                getCorrectAnswer().join(",") +
//                answers;
//    }


    @Override
    public String toString() {
        return super.toString();
    }
}

