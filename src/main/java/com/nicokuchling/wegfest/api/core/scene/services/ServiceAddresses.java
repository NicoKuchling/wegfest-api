package com.nicokuchling.wegfest.api.core.scene.services;

public class ServiceAddresses {
    private final String scene;
    private final String survey;

    public ServiceAddresses() {
        this.scene = null;
        this.survey = null;
    }

    public ServiceAddresses(
            String sceneAddress,
            String surveyAddress) {

        this.scene = sceneAddress;
        this.survey = surveyAddress;
    }

    public String getScene() {
        return scene;
    }

    public String getSurvey() {
        return survey;
    }
}
