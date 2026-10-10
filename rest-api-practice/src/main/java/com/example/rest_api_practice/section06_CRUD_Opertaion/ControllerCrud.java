package com.example.rest_api_practice.section06_CRUD_Opertaion;

import com.example.rest_api_practice.section01_basic_get.EmployeeNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControllerCrud {

    List<Employee> employees = new ArrayList<>();

    public ControllerCrud() {
        employees.add(new Employee(1, "Amit", "IT"));
        employees.add(new Employee(2, "Priya", "HR"));
        employees.add(new Employee(3, "Rahul", "Finance"));
    }

    //READ ALL  DATA
    @GetMapping("/all/employee")
    public List<Employee> getAllEmployee() {
        return employees;
    }

    //CREATE DATA
    @PostMapping("/add/employee")
    public List<Employee> addEmployee(@RequestBody Employee employee) {
        employees.add(employee);
        return employees;
    }

    //READ BY ID EMPLOYEE INFO
    @GetMapping("/employee/find/{id}")
    public Employee getEmployeeId(@PathVariable int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        throw new EmployeeNotFoundException("Employee not found with id =" + id);
    }

    //updated student data

    @PutMapping("/employee/update/{id}")
    public Employee updatedEmployee(
            @PathVariable int id, @RequestBody Employee updateEmployee) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                emp.setName(updateEmployee.getName());
                emp.setDepartment(updateEmployee.getDepartment());
                return emp;
            }
        }
        throw new EmployeeNotFoundException("EMPLOYEE NOT FOUND WITH ID ="+id);
    }

    // DELETE: Remove student

    @DeleteMapping("/employee/delete/{id}")
    public String deleteEmployee(@PathVariable int id){
        for(Employee emp:employees){
            if(emp.getId()==id){
                employees.remove(emp);
                return "Employee deleted Successfully";
            }
        }
        return "student not found";
    }

}










