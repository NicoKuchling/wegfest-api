package com.nicokuchling.wegfest.api.core.scene;

public class SceneInteractionRecord {
    public static enum DAYTIME {
        DAY,
        DUSK,
        NIGHT
    }

    public static enum SPEEDLIMIT {
        SLOW,
        MEDIUM,
        FAST
    }

    public static enum FREQUENCY {
        LOW,
        MEDIUM,
        HIGH
    }

    private int sceneInteractionRecordId;
    private int sceneId;
    private String unitySceneSetupId;
    private String playerPosition;
    private DAYTIME daytime;
    private SPEEDLIMIT speedLimit;
    private FREQUENCY eMobilityFrequency;
    private FREQUENCY trafficVolume;
    private boolean hasCyclists;
    private boolean hasTrafficLights;
    private int timeNeededForOrientation;
    private int timeNeededForRoadCrossing;
    private int numberOfDangerousSituations;
    private int numberOfAccidents;
    private int numberOfCrossingAttempts;
    private int surveyResponseId;
    private String serviceAddress;

    public SceneInteractionRecord() {
        this.sceneInteractionRecordId = -1;
        this.sceneId = -1;
        this.unitySceneSetupId = null;
        this.playerPosition = null;
        this.daytime = null;
        this.speedLimit = null;
        this.eMobilityFrequency = null;
        this.trafficVolume = null;
        this.hasCyclists = false;
        this.hasTrafficLights = false;
        this.timeNeededForOrientation = -1;
        this.timeNeededForRoadCrossing = -1;
        this.numberOfDangerousSituations = -1;
        this.numberOfAccidents = -1;
        this.numberOfCrossingAttempts = -1;
        this.surveyResponseId = -1;
        this.serviceAddress = null;
    }

    public SceneInteractionRecord(
            int sceneInteractionRecordId,
            int sceneId,
            String unitySceneSetupId,
            String playerPosition,
            DAYTIME daytime,
            SPEEDLIMIT speedLimit,
            FREQUENCY eMobilityFrequency,
            FREQUENCY trafficVolume,
            boolean hasCyclists,
            boolean hasTrafficLights,
            int timeNeededForOrientation,
            int timeNeededForRoadCrossing,
            int numberOfDangerousSituations,
            int numberOfAccidents,
            int numberOfCrossingAttempts,
            int surveyResponseId,
            String serviceAddress) {

        this.sceneInteractionRecordId = sceneInteractionRecordId;
        this.sceneId = sceneId;
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
        this.surveyResponseId = surveyResponseId;
        this.serviceAddress = serviceAddress;
    }

    public int getSceneInteractionRecordId() {
        return sceneInteractionRecordId;
    }

    public void setSceneInteractionRecordId(int sceneInteractionRecordId) {
        this.sceneInteractionRecordId = sceneInteractionRecordId;
    }

    public int getSceneId() {
        return sceneId;
    }

    public void setSceneId(int sceneId) {
        this.sceneId = sceneId;
    }

    public String getUnitySceneSetupId() {
        return unitySceneSetupId;
    }

    public void setUnitySceneSetupId(String unitySceneSetupId) {
        this.unitySceneSetupId = unitySceneSetupId;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public DAYTIME getDaytime() {
        return daytime;
    }

    public void setDaytime(DAYTIME daytime) {
        this.daytime = daytime;
    }

    public SPEEDLIMIT getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(SPEEDLIMIT speedLimit) {
        this.speedLimit = speedLimit;
    }

    public FREQUENCY geteMobilityFrequency() {
        return eMobilityFrequency;
    }

    public void seteMobilityFrequency(FREQUENCY eMobilityFrequency) {
        this.eMobilityFrequency = eMobilityFrequency;
    }

    public FREQUENCY getTrafficVolume() {
        return trafficVolume;
    }

    public void setTrafficVolume(FREQUENCY trafficVolume) {
        this.trafficVolume = trafficVolume;
    }

    public boolean hasCyclists() {
        return hasCyclists;
    }

    public void setHasCyclists(boolean hasCyclists) {
        this.hasCyclists = hasCyclists;
    }

    public boolean hasTrafficLights() {
        return hasTrafficLights;
    }

    public void setHasTrafficLights(boolean hasTrafficLights) {
        this.hasTrafficLights = hasTrafficLights;
    }

    public int getTimeNeededForOrientation() {
        return timeNeededForOrientation;
    }

    public void setTimeNeededForOrientation(int timeNeededForOrientation) {
        this.timeNeededForOrientation = timeNeededForOrientation;
    }

    public int getTimeNeededForRoadCrossing() {
        return timeNeededForRoadCrossing;
    }

    public void setTimeNeededForRoadCrossing(int timeNeededForRoadCrossing) {
        this.timeNeededForRoadCrossing = timeNeededForRoadCrossing;
    }

    public int getNumberOfDangerousSituations() {
        return numberOfDangerousSituations;
    }

    public void setNumberOfDangerousSituations(int numberOfDangerousSituations) {
        this.numberOfDangerousSituations = numberOfDangerousSituations;
    }

    public int getNumberOfAccidents() {
        return numberOfAccidents;
    }

    public void setNumberOfAccidents(int numberOfAccidents) {
        this.numberOfAccidents = numberOfAccidents;
    }

    public int getNumberOfCrossingAttempts() {
        return numberOfCrossingAttempts;
    }

    public void setNumberOfCrossingAttempts(int numberOfCrossingAttempts) {
        this.numberOfCrossingAttempts = numberOfCrossingAttempts;
    }

    public int getSurveyResponseId() {
        return surveyResponseId;
    }

    public void setSurveyResponseId(int surveyResponseId) {
        this.surveyResponseId = surveyResponseId;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }
}
