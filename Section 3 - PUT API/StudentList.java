
package com.example.rest_api_practice.section03_Put;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class StudentList {

    ArrayList<Student> student = new ArrayList<>();

    public StudentList() {
        student.add(new Student(1, "bhavesh", "washim"));
        student.add(new Student(2, "yash", "washim"));
        student.add(new Student(3, "arnav", "washim"));
        student.add(new Student(4, "pooja", "washim"));
    }

    @PutMapping("/College/student/{id}")
    public Student updateStudent(
            @PathVariable int id,
            @RequestBody Student updateStudent) {

        for (Student std : student) {

            if (std.getRollNo() == id) {

                std.setName(updateStudent.getName());
                std.setLocation(updateStudent.getLocation());

                return std;
            }
        }

        throw new StudentNotFoundException(
                "Student not found with id = " + id);
    }
}
