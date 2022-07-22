package com.example.quizindonesiaku;

import java.lang.reflect.Constructor;

public class QuestionsList {

    private String question, pilihan1, pilihan2, pilihan3, pilihan4, answer;
    private String userSelectedAnswer;

    public QuestionsList(String question, String pilihan1, String pilihan2, String pilihan3, String pilihan4, String answer, String userSelectedAnswer) {
        this.question = question;
        this.pilihan1 = pilihan1;
        this.pilihan2 = pilihan2;
        this.pilihan3 = pilihan3;
        this.pilihan4 = pilihan4;
        this.answer = answer;
        this.userSelectedAnswer = userSelectedAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getPilihan1() {
        return pilihan1;
    }

    public String getPilihan2() {
        return pilihan2;
    }

    public String getPilihan3() {
        return pilihan3;
    }

    public String getPilihan4() {
        return pilihan4;
    }

    public String getAnswer() {
        return answer;
    }

    public String getUserSelectedAnswer() {
        return userSelectedAnswer;
    }

    public void setUserSelectedAnswer(String userSelectedAnswer) {
        this.userSelectedAnswer = userSelectedAnswer;
    }
}
