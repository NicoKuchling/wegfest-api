package com.nicokuchling.wegfest.api.core.survey;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class SurveyResponse {
    private final int surveyResponseId;
    private final int personId;
    private final Map<String, String> multipleChoiceQuestionToAnswerMap;
    private final String serviceAddress;

    public SurveyResponse() {
        this.surveyResponseId = -1;
        this.personId = -1;
        this.multipleChoiceQuestionToAnswerMap = null;
        this.serviceAddress = null;
    }

    public SurveyResponse(
            int surveyResponseId,
            int personId,
            Map<String, String> multipleChoiceQuestionToAnswerMap,
            String serviceAddress) {
        this.surveyResponseId = surveyResponseId;
        this.personId = personId;
        this.multipleChoiceQuestionToAnswerMap = new HashMap<>(multipleChoiceQuestionToAnswerMap);
        this.serviceAddress = serviceAddress;
    }

    public int getSurveyResponseId() {
        return surveyResponseId;
    }

    public int getPersonId() {
        return personId;
    }

    public Map<String, String> getMultipleChoiceQuestionToAnswerMap() {
        return Collections.unmodifiableMap(multipleChoiceQuestionToAnswerMap);
    }

    public String getServiceAddress() {
        return serviceAddress;
    }
}
