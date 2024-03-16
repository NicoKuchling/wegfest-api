package com.nicokuchling.wegfest.api.core.person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface PersonService {

    @GetMapping(
            value = "/person/{personId}",
            produces = "application/json")
    Person getPersonById(@PathVariable int personId);
}
