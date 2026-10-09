package com.example.rest_api_practice.section01_basic_get;

public class Student {
    private int rollNo;
    private String name;
    private String Location;

    public Student(int rollNo, String name, String location) {
        this.rollNo = rollNo;
        this.name = name;
        Location = location;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
}
