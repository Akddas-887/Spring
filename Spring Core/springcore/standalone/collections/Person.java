package com.springcore.standalone.collections;

import java.util.List;

public class Person {

    private List<String> freinds;


    public List<String> getFreinds() {
        return freinds;
    }

    public void setFreinds(List<String> freinds) {
        this.freinds = freinds;
    }

    public Person(List<String> freinds) {
        this.freinds = freinds;
    }

    public Person() {
        super();
    }

    @Override
    public String toString() {
        return "Person{" +
                "freinds=" + freinds +
                '}';
    }
}
