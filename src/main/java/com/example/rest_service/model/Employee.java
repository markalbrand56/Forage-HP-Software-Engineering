package com.example.rest_service.model;

public class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String title;

    public Employee(String employee_id, String first_name, String last_name, String email, String title) {
        this.employeeId = employee_id;
        this.firstName = first_name;
        this.lastName = last_name;
        this.email = email;
        this.title = title;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }
}
