package com.examplmakecodeeasy.triviaaquizapp.module;

public class quizQuestion {

    private String questiontext;
    private boolean truAnswer;

    public quizQuestion(String questiontext, boolean truAnswer) {
        this.questiontext = questiontext;
        this.truAnswer = truAnswer;
    }

    public String getQuestiontext() {
        return questiontext;
    }

    public void setQuestiontext(String questiontext) {
        this.questiontext = questiontext;
    }

    public boolean isTruAnswer() {
        return truAnswer;
    }

    public void setTruAnswer(boolean truAnswer) {
        this.truAnswer = truAnswer;
    }
}
