package com.demo.demo.ci;

public class Person {
    private String name;
    private int personId;
    private Certi certi;
    public Person() {
        super();
    }

    public Person(String name, int personId,Certi certi) {
        this.name = name;
        this.personId = personId;
        this.certi=certi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + this.name + '\'' +
                ", personId=" + this.personId +
                ", Certi=" + this.certi +
                '}';
    }
}
