package com.company.Humans;

public abstract class Human implements List {
    protected String name;
    protected Integer idNumber;


    public Human(String name, Integer idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public String getName() {
        return this.name;
    }
}
