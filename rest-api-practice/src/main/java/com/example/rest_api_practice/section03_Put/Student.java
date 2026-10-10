package com.example.rest_api_practice.section03_Put;

public class Student {
    private int rollNo;
    private String name;
    private String location;

    public Student() {
    }

    public Student(int rollNo, String name, String location) {
        this.rollNo = rollNo;
        this.name = name;
        this.location = location;
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
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

