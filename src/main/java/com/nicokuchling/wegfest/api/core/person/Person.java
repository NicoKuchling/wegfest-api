package com.nicokuchling.wegfest.api.core.person;

import java.time.LocalDate;

public final class Person {

    public static enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

    private final int personId;
    private final String firstName;
    private final String lastName;
    private final LocalDate dateOfBirth;
    private final Gender gender;
    private final String serviceAddress;

    public Person() {
        this.personId = -1;
        this.firstName = null;
        this.lastName = null;
        this.dateOfBirth = LocalDate.MIN;
        this.gender = null;
        this.serviceAddress = null;
    }

    public Person(
            int personId,
            String firstName,
            String lastName,
            LocalDate dateOfBirth,
            Gender gender,
            String serviceAddress) {

        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.serviceAddress = serviceAddress;
    }

    public int getPersonId() {
        return personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }
}
