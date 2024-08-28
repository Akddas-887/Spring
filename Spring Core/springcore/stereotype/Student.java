package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("obj")
@Scope("prototype")
public class Student {
    @Value("Ankush")
    private String studentName;
    @Value("Indore")
    private String address;

    @Value("#{list1}")
    private List<String> city;


    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", address='" + address + '\'' +
                ", city=" + city +
                '}';
    }

    public List<String> getCity() {
        return city;
    }

    public void setCity(List<String> city) {
        this.city = city;
    }

    public Student(String studentName, String address, List<String> city) {
        this.studentName = studentName;
        this.address = address;
        this.city = city;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(String studentName, String address) {
        this.studentName = studentName;
        this.address = address;
    }

    public Student() {
        super();
    }

}
