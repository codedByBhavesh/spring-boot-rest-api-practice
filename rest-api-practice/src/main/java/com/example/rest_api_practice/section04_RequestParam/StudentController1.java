package com.example.rest_api_practice.section04_RequestParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController1 {
    List<Student> students = new ArrayList<>();

    public StudentController1() {
        students.add(new Student(1, "bhavesh", "akoloa"));
        students.add(new Student(2, "arjun", "bihar"));
    }
    @GetMapping("std")
    public Student getStudentByName(@RequestParam String name) {
        for (Student std : students) {
            if (std.getName().equalsIgnoreCase(name)) {
                return std;
            }
        }
        return null;
    }
}







