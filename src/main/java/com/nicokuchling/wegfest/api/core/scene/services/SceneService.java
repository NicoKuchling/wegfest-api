package com.nicokuchling.wegfest.api.core.scene.services;

import com.nicokuchling.wegfest.api.core.scene.aggregates.SceneAggregate;
import com.nicokuchling.wegfest.api.core.scene.aggregates.SceneInteractionRecordAggregate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Set;

public interface SceneService {

    @GetMapping(
            value = "/scene",
            produces = "application/json")
    Set<SceneAggregate> getAllSceneAggregates();

    @GetMapping(
            value = "/scene/interaction/record",
            produces = "application/json")
    List<SceneInteractionRecordAggregate> getSceneInteractionRecordAggregatesByIds(
            @RequestParam(value="sceneInteractionRecordId") List<Integer> sceneInteractionRecordIds);
}
