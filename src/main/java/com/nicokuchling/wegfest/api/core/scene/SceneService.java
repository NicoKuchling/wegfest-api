package com.nicokuchling.wegfest.api.core.scene;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Set;

public interface SceneService {

    @GetMapping(
            value = "/scene",
            produces = "application/json")
    Set<Scene> getAllScenes();

    @GetMapping(
            value = "/scene/interaction/record",
            produces = "application/json")
    List<SceneInteractionRecord> getSceneInteractionRecordsByIds(@RequestParam List<Integer> sceneInteractionRecordId);
}
