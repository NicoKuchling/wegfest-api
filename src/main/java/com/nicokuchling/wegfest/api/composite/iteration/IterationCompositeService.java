package com.nicokuchling.wegfest.api.composite.iteration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IterationCompositeService {

    @GetMapping(
            value = "/iteration/composite",
            produces = "application/json")
    List<IterationAggregate> getAllIterations();
}
