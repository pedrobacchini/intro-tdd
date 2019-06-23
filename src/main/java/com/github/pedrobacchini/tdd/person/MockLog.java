package com.github.pedrobacchini.tdd.person;

import lombok.Getter;

@Getter
public class MockLog implements LogGenerator {

    private String name;

    public void createLog(String personName) { this.name = personName; }
}
