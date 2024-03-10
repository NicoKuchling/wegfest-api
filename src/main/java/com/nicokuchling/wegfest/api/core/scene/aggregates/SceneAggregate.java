package com.nicokuchling.wegfest.api.core.scene.aggregates;

import com.nicokuchling.wegfest.api.core.scene.Scene;
import com.nicokuchling.wegfest.api.core.scene.services.ServiceAddresses;
import com.nicokuchling.wegfest.api.core.survey.MultipleChoiceQuestion;

import java.util.ArrayList;
import java.util.List;

public final class SceneAggregate {
    private final int sceneId;
    private final String name;
    private final String description;
    private final Scene.DIFFICULTY difficulty;
    private final List<MultipleChoiceQuestion> multipleChoiceQuestions;
    private final ServiceAddresses serviceAddresses;

    public SceneAggregate() {
        this.sceneId = -1;
        this.name = null;
        this.description = null;
        this.difficulty = null;
        this.multipleChoiceQuestions = null;
        this.serviceAddresses = null;
    }

    public SceneAggregate(
            int sceneId,
            String name,
            String description,
            Scene.DIFFICULTY difficulty,
            List<MultipleChoiceQuestion> multipleChoiceQuestions,
            ServiceAddresses serviceAddress) {

        this.sceneId = sceneId;
        this.name = name;
        this.description = description;
        this.difficulty = difficulty;
        this.multipleChoiceQuestions = new ArrayList<>(multipleChoiceQuestions);
        this.serviceAddresses = serviceAddress;
    }

    public int getSceneId() {
        return sceneId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Scene.DIFFICULTY getDifficulty() {
        return difficulty;
    }

    public List<MultipleChoiceQuestion> getMultipleChoiceQuestions() {
        return multipleChoiceQuestions;
    }

    public ServiceAddresses getServiceAddresses() {
        return serviceAddresses;
    }
}
