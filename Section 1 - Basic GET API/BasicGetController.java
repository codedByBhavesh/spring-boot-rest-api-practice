
package com.example.rest_api_practice.section01_basic_get;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class BasicGetController {

    @GetMapping("/hello")
    public String getMessage() {
        return "My first GET API is working!";
    }

    @GetMapping("/name")
    public String[] getName() {
        String[] name = {"ram", "shyam", "harry"};
        return name;
    }

    @GetMapping("/names")
    public Map<Integer, String> getUser() {
        Map<Integer, String> user = new HashMap<Integer, String>();
        user.put(1, "amol");
        user.put(2, "anmol");
        user.put(3, "varun");
        return user;
    }

    @GetMapping("/studentList")
    public ArrayList<Student> getStudent() {

        ArrayList<Student> student = new ArrayList<>();
        Student student1 = new Student(1, "bhavesh", "nagpur");
        Student student2 = new Student(2, "vishal", "akola");
        Student student3 = new Student(3, "arjun", "pune");

        student.add(student1);
        student.add(student2);
        student.add(student3);
        return student;
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable int id) {

        ArrayList<Employee> employee = new ArrayList<>();
        Employee emp1 = new Employee("bhavesh", 1, "s2p");
        Employee emp2 = new Employee("aniket", 2, "hcl");
        Employee emp3 = new Employee("dipak", 3, "mahindra");
        Employee emp4 = new Employee("mangesh", 4, "airIndia");
        Employee emp5 = new Employee("rahul", 5, "techno");

        employee.add(emp1);
        employee.add(emp2);
        employee.add(emp3);
        employee.add(emp4);
        employee.add(emp5);

        for (Employee emp : employee) {

            if (emp.getId() == id) {
                return emp;
            }
        }
        throw new EmployeeNotFoundException("Employee not found with id = "+id);

    }
}








