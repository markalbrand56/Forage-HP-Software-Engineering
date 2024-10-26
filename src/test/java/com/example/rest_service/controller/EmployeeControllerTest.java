package com.example.rest_service.controller;

import com.example.rest_service.model.Employee;
import com.example.rest_service.model.Employees;
import com.example.rest_service.service.EmployeeManager;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@SpringBootTest
public class EmployeeControllerTest {
    @Mock
    private EmployeeManager employeeManager;

    @InjectMocks
    private EmployeeController employeeController;

    @Test
    public void testGetEmployees() {
        Employees employees = new Employees();
        when(employeeManager.getEmployees()).thenReturn(employees);

        Employees result = employeeController.getEmployees();
        assertEquals(0, result.getEmployeeList().size(), "The employee list should be empty.");

        employees.addEmployee(new Employee("E001", "John", "Doe", "johndoe@email.com", "Manager"));

        result = employeeController.getEmployees();
        assertEquals(1, result.getEmployeeList().size(), "The employee list should contain one employee.");
    }

    @Test
    public void testAddEmployee() {
        Employee newEmployee = new Employee("E004", "Michael", "Scott", "michael.scott@dundermifflin.com", "Regional Manager");

        doNothing().when(employeeManager).addEmployee(newEmployee);

        String response = employeeController.addEmployee(newEmployee);

        assertEquals("Employee added successfully!", response);
    }
}
