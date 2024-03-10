package com.nicokuchling.wegfest.api.core.scene;


import com.nicokuchling.wegfest.api.core.survey.SurveyResponse;

public final class SceneInteractionRecordAggregate {
    private final int sceneInteractionRecordId;
    private final SceneAggregate scene;
    private final String unitySceneSetupId;
    private final String playerPosition;
    private final SceneInteractionRecord.DAYTIME daytime;
    private final SceneInteractionRecord.SPEEDLIMIT speedLimit;
    private final SceneInteractionRecord.FREQUENCY eMobilityFrequency;
    private final SceneInteractionRecord.FREQUENCY trafficVolume;
    private final boolean hasCyclists;
    private final boolean hasTrafficLights;
    private final int timeNeededForOrientation;
    private final int timeNeededForRoadCrossing;
    private final int numberOfDangerousSituations;
    private final int numberOfAccidents;
    private final int numberOfCrossingAttempts;
    private final SurveyResponse surveyResponse;
    private final ServiceAddresses serviceAddresses;

    public SceneInteractionRecordAggregate(
            int sceneInteractionRecordId,
            SceneAggregate scene,
            String unitySceneSetupId,
            String playerPosition,
            SceneInteractionRecord.DAYTIME daytime,
            SceneInteractionRecord.SPEEDLIMIT speedLimit,
            SceneInteractionRecord.FREQUENCY eMobilityFrequency,
            SceneInteractionRecord.FREQUENCY trafficVolume,
            boolean hasCyclists,
            boolean hasTrafficLights,
            int timeNeededForOrientation,
            int timeNeededForRoadCrossing,
            int numberOfDangerousSituations,
            int numberOfAccidents,
            int numberOfCrossingAttempts,
            SurveyResponse surveyResponse,
            ServiceAddresses serviceAddresses) {

        this.sceneInteractionRecordId = sceneInteractionRecordId;
        this.scene = scene;
        this.unitySceneSetupId = unitySceneSetupId;
        this.playerPosition = playerPosition;
        this.daytime = daytime;
        this.speedLimit = speedLimit;
        this.eMobilityFrequency = eMobilityFrequency;
        this.trafficVolume = trafficVolume;
        this.hasCyclists = hasCyclists;
        this.hasTrafficLights = hasTrafficLights;
        this.timeNeededForOrientation = timeNeededForOrientation;
        this.timeNeededForRoadCrossing = timeNeededForRoadCrossing;
        this.numberOfDangerousSituations = numberOfDangerousSituations;
        this.numberOfAccidents = numberOfAccidents;
        this.numberOfCrossingAttempts = numberOfCrossingAttempts;
        this.surveyResponse = surveyResponse;
        this.serviceAddresses = serviceAddresses;
    }

    public int getSceneInteractionRecordId() {
        return sceneInteractionRecordId;
    }

    public SceneAggregate getScene() {
        return scene;
    }

    public String getUnitySceneSetupId() {
        return unitySceneSetupId;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public SceneInteractionRecord.DAYTIME getDaytime() {
        return daytime;
    }

    public SceneInteractionRecord.SPEEDLIMIT getSpeedLimit() {
        return speedLimit;
    }

    public SceneInteractionRecord.FREQUENCY geteMobilityFrequency() {
        return eMobilityFrequency;
    }

    public SceneInteractionRecord.FREQUENCY getTrafficVolume() {
        return trafficVolume;
    }

    public boolean isHasCyclists() {
        return hasCyclists;
    }

    public boolean isHasTrafficLights() {
        return hasTrafficLights;
    }

    public int getTimeNeededForOrientation() {
        return timeNeededForOrientation;
    }

    public int getTimeNeededForRoadCrossing() {
        return timeNeededForRoadCrossing;
    }

    public int getNumberOfDangerousSituations() {
        return numberOfDangerousSituations;
    }

    public int getNumberOfAccidents() {
        return numberOfAccidents;
    }

    public int getNumberOfCrossingAttempts() {
        return numberOfCrossingAttempts;
    }

    public SurveyResponse getSurveyResponse() {
        return surveyResponse;
    }

    public ServiceAddresses getServiceAddresses() {
        return serviceAddresses;
    }
}
