package com.nicokuchling.wegfest.api.core.iteration;

public class IterationPosition {
    private int positionInQueue;
    private int iterationId;

    public IterationPosition() {
        this.positionInQueue = -1;
        this.iterationId = -1;
    }

    public IterationPosition(int positionInQueue, int iterationId) {
        this.iterationId = iterationId;
        this.positionInQueue = positionInQueue;
    }

    public int getPositionInQueue() {
        return positionInQueue;
    }

    public void setPositionInQueue(int positionInQueue) {
        this.positionInQueue = positionInQueue;
    }

    public int getIterationId() {
        return iterationId;
    }
}
