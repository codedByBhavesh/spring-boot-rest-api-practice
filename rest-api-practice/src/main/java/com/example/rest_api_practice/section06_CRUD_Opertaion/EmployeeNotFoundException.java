package com.example.rest_api_practice.section06_CRUD_Opertaion;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(String msg){
        super(msg);
    }
}
