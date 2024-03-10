package com.nicokuchling.wegfest.api.core.survey;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Set;

public interface SurveyService {

    @GetMapping(
            value = "/survey/multiple-choice-question",
            produces = "application/json")
    Set<MultipleChoiceQuestion> getAllMultipleChoiceQuestions();

    @GetMapping(
            value = "/survey/response",
            produces = "application/json")
    Set<SurveyResponse> getSurveyResponsesByIds(
            @RequestParam(value="surveyResponseId") List<Integer> surveyResponseIds);
}
