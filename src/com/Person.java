package com;

public abstract class Person {
    private String name;
    private int intelligence;

    public Person(String name, int intelligence) {
        this.name = name;
        this.intelligence = intelligence < 0 ? 0 : intelligence > 100 ? 100 : intelligence;
    }

    public String getName() {
        return name;
    }

    public int getIntelligence() {
        return intelligence;
    }
}
