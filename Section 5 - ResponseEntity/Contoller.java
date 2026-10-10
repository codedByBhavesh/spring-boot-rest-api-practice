package com.example.rest_api_practice.section05_ResponseEntity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class Contoller {

    List<Student> student = new ArrayList<>() ;
     public Contoller(){

         student.add(new Student(1,"bhavesh","washim"));
         student.add(new Student(2,"mohan","nagpur"));
         student.add(new Student(3,   "mahavir","pusad"));
         student.add(new Student(4,"hanuman","sarkini"));
     }
     @GetMapping("/getData/{id}")
     public ResponseEntity<Student> getStudentById(@PathVariable int id) {
         for (Student std : student) {
             if (std.getId() == id) {
                 return ResponseEntity.ok(std);
             }
         }
         return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
     }
     }

