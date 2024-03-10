package com.nicokuchling.wegfest.api.core.iteration;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface IterationService {

    @GetMapping(
            value = "/iteration",
            produces = "application/json")
    List<Iteration> getAllIterations();

    @GetMapping(
            value = "/iteration/queue",
            produces = "application/json")
    List<Integer> getIterationQueue();

    @GetMapping(
            value = "/iteration/next/peak",
            produces = "application/json")
    Iteration peakNextIteration();

    @GetMapping(
            value = "/iteration/next/pop",
            produces = "application/json")
    Iteration popNextIteration();
}
