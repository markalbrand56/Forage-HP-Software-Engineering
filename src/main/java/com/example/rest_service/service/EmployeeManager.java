package com.example.rest_service.service;

import com.example.rest_service.model.Employee;
import com.example.rest_service.model.Employees;
import org.springframework.stereotype.Component;

@Component
public class EmployeeManager {
    private Employees employees = new Employees();

    public EmployeeManager() {
        employees.addEmployee(new Employee("E001", "John", "Doe", "john.doe@example.com", "Manager"));
        employees.addEmployee(new Employee("E002", "Jane", "Smith", "jane.smith@example.com", "Engineer"));
        employees.addEmployee(new Employee("E003", "Emily", "Johnson", "emily.johnson@example.com", "HR Specialist"));
    }

    public Employees getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.addEmployee(employee);
    }
}
