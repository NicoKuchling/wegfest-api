package com.nicokuchling.wegfest.api.core.iteration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Iteration {
    private final int iterationId;
    private final int personId;
    private boolean isCompleted;
    private boolean isAborted;
    private LocalDate completedAt;
    private final List<Integer> sceneInteractionRecordIds;
    private String serviceAddress;

    public Iteration() {
        this.iterationId = -1;
        this.personId = -1;
        this.isCompleted = false;
        this.isAborted = false;
        this.completedAt = null;
        this.sceneInteractionRecordIds = null;
        this.serviceAddress = null;
    }

    public Iteration(
            int iterationId,
            int personId,
            List<Integer> sceneInteractionRecordIds,
            String serviceAddress) {

        this.iterationId = iterationId;
        this.personId = personId;
        this.isCompleted = false;
        this.isAborted = false;
        this.completedAt = LocalDate.MIN;
        this.sceneInteractionRecordIds = new ArrayList<>(sceneInteractionRecordIds);
        this.serviceAddress = serviceAddress;
    }

    public int getIterationId() {
        return iterationId;
    }

    public int getPersonId() {
        return personId;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public boolean isAborted() {
        return isAborted;
    }

    public void setAborted(boolean aborted) {
        isAborted = aborted;
    }

    public LocalDate getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(LocalDate completedAt) {
        this.completedAt = completedAt;
    }

    public List<Integer> getSceneInteractionRecordIds() {
        return Collections.unmodifiableList(sceneInteractionRecordIds);
    }

    public String getServiceAddress() { return serviceAddress; }
}
