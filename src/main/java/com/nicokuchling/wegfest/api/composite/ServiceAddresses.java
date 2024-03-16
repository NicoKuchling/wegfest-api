package com.nicokuchling.wegfest.api.composite;

public class ServiceAddresses {
    private final String compositeIteration;
    private final String iteration;
    private final String person;
    private final String scene;

    public ServiceAddresses() {
        this.compositeIteration = null;
        this.iteration = null;
        this.person = null;
        this.scene = null;
    }

    public ServiceAddresses(
            String compositeIterationAddress,
            String iterationAddress,
            String personAddress,
            String sceneAddress) {

        this.compositeIteration = compositeIterationAddress;
        this.iteration = iterationAddress;
        this.person = personAddress;
        this.scene = sceneAddress;
    }

    public String getCompositeIteration() {
        return compositeIteration;
    }

    public String getIteration() {
        return iteration;
    }

    public String getPerson() {
        return person;
    }

    public String getScene() {
        return scene;
    }
}
