package com.springcore.javaconfig;

import org.springframework.stereotype.Component;


public class Student {
    private Samosa samosa;

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }

   public Student(Samosa samosa) {
        super();
        this.samosa = samosa;
    }

    public Student() {
        super();
    }

    public void study(){
        System.out.println("Student is Studying");
        samosa.display();
    }


    @Override
    public String toString() {
        return "Student{" +
                "samosa=" + samosa +
                '}';
    }
}
