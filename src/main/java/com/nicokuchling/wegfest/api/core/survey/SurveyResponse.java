package com.nicokuchling.wegfest.api.core.survey;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class SurveyResponse {
    private final int surveyResponseId;
    private final int personId;
    private final Map<Integer, String> multipleChoiceQuestionIdToAnswerMap;
    private final String serviceAddress;

    public SurveyResponse() {
        this.surveyResponseId = -1;
        this.personId = -1;
        this.multipleChoiceQuestionIdToAnswerMap = null;
        this.serviceAddress = null;
    }

    public SurveyResponse(
            int surveyResponseId,
            int personId,
            Map<Integer, String> multipleChoiceQuestionIdToAnswerMap,
            String serviceAddress) {
        this.surveyResponseId = surveyResponseId;
        this.personId = personId;
        this.multipleChoiceQuestionIdToAnswerMap = new HashMap<>(multipleChoiceQuestionIdToAnswerMap);
        this.serviceAddress = serviceAddress;
    }

    public int getSurveyResponseId() {
        return surveyResponseId;
    }

    public int getPersonId() {
        return personId;
    }

    public Map<Integer, String> getMultipleChoiceQuestionIdToAnswerMap() {
        return Collections.unmodifiableMap(multipleChoiceQuestionIdToAnswerMap);
    }

    public String getServiceAddress() {
        return serviceAddress;
    }
}
