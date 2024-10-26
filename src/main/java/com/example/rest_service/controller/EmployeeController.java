package com.example.rest_service.controller;

import com.example.rest_service.model.Employee;
import com.example.rest_service.model.Employees;
import com.example.rest_service.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeManager employeeManager;

    @GetMapping("/employees")
    public Employees getEmployees() {
        return employeeManager.getEmployees();
    }

    @PostMapping(value = "/employees", consumes = "application/json", produces = "application/json")
    public String addEmployee(@RequestBody Employee employee) {
        employeeManager.addEmployee(employee);
        return "Employee added successfully!";
    }

}
