package com.github.pedrobacchini.tdd.person;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonControllerTest {

    @Test
    public void shouldCreateLogWhenDeletePeople() {
        Person person = new Person();
        person.setName("Alexandre");
        MockLog mockLog = new MockLog();
        PersonController personController = new PersonController(mockLog);
        personController.delete(person);

        assertEquals(person.getName(), mockLog.getName());
    }
}