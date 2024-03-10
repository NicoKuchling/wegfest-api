package com.nicokuchling.wegfest.api.composite.iteration;

import com.nicokuchling.wegfest.api.core.scene.aggregates.SceneInteractionRecordAggregate;
import com.nicokuchling.wegfest.api.core.person.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class IterationAggregate {
    private final int iterationId;
    private final Person person;
    private final boolean isCompleted;
    private final boolean isAborted;
    private final LocalDate completedAt;
    private final List<SceneInteractionRecordAggregate> sceneInteractionRecordAggregates;

    public IterationAggregate(
            int iterationId,
            Person person,
            boolean isCompleted,
            boolean isAborted,
            LocalDate completedAt,
            List<SceneInteractionRecordAggregate> sceneInteractionRecordAggregates) {

        this.iterationId = iterationId;
        this.person = person;
        this.isCompleted = false;
        this.isAborted = false;
        this.completedAt = completedAt;
        this.sceneInteractionRecordAggregates = new ArrayList<>(sceneInteractionRecordAggregates);
    }

    public int getIterationId() {
        return iterationId;
    }

    public Person getPerson() {
        return person;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public boolean isAborted() {
        return isAborted;
    }

    public LocalDate getCompletedAt() {
        return completedAt;
    }

    public List<SceneInteractionRecordAggregate> getSceneInteractionRecordAggregates() {
        return sceneInteractionRecordAggregates;
    }
}
