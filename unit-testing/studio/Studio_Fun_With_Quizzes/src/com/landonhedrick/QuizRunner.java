package com.landonhedrick;

import java.util.ArrayList;
import java.util.List;

public class QuizRunner {
    public static void main(String[] args) {

        MultipleChoiceQuestion multipleChoiceQuestion = new MultipleChoiceQuestion("What country is the unicorn the national animal?", "Scotland", new ArrayList<String>(List.of("Malta", "USA", "Uganda", "Banana Republic")));
        System.out.println(multipleChoiceQuestion.getQuestion());
        System.out.println(multipleChoiceQuestion.getCorrectAnswer());
        System.out.println(multipleChoiceQuestion);
        System.out.println(multipleChoiceQuestion.answers);
    }
}

