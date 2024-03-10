package com.nicokuchling.wegfest.api.core.survey;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Set;

public interface SurveyService {

    @GetMapping(
            value = "/survey/multiple-choice-question",
            produces = "application/json")
    Set<MultipleChoiceQuestion> getAllMultipleChoiceQuestions();

    @GetMapping(
            value = "/survey/response/person/{personId}",
            produces = "application/json")
    SurveyResponse getSurveyResponseByPersonId(@PathVariable int personId);
}
