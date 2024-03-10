package com.nicokuchling.wegfest.api.core.survey;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class MultipleChoiceQuestion {
    private final int questionId;
    private final String question;
    private final List<String> possibleAnswers;
    private final String serviceAddress;

    public MultipleChoiceQuestion() {
        this.questionId = -1;
        this.question = null;
        this.possibleAnswers = null;
        this.serviceAddress = null;
    }

    public MultipleChoiceQuestion(
            int questionId,
            String question,
            List<String> possibleAnswers,
            String serviceAddress) {

        this.questionId = questionId;
        this.question = question;
        this.possibleAnswers = new ArrayList<>(possibleAnswers);
        this.serviceAddress = serviceAddress;
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getPossibleAnswers() {
        return Collections.unmodifiableList(possibleAnswers);
    }

    public String getServiceAddress() {
        return serviceAddress;
    }
}
