package com.nicokuchling.wegfest.api.core.scene;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Scene {

    public static enum DIFFICULTY {
        EASY,
        INTERMEDIATE,
        HARD
    }

    private final int sceneId;
    private final String name;
    private final String description;
    private final DIFFICULTY difficulty;
    private final List<Integer> multipleChoiceQuestionIds;
    private final String serviceAddress;

    public Scene() {
        this.sceneId = -1;
        this.name = null;
        this.description = null;
        this.difficulty = null;
        this.multipleChoiceQuestionIds = null;
        this.serviceAddress = null;
    }

    public Scene(
            int sceneId,
            String name,
            String description,
            DIFFICULTY difficulty,
            List<Integer> multipleChoiceQuestionIds,
            String serviceAddress) {

        this.sceneId = sceneId;
        this.name = name;
        this.description = description;
        this.difficulty = difficulty;
        this.multipleChoiceQuestionIds = new ArrayList<>(multipleChoiceQuestionIds);
        this.serviceAddress = serviceAddress;
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

    public DIFFICULTY getDifficulty() {
        return difficulty;
    }

    public List<Integer> getMultipleChoiceQuestionIds() {
        return Collections.unmodifiableList(multipleChoiceQuestionIds);
    }

    public String getServiceAddress() {
        return serviceAddress;
    }
}
