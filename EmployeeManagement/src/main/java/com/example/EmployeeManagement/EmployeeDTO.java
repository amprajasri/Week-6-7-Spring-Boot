package com.example.EmployeeManagement;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EmployeeDTO {

    @NotBlank(message="the name is requiered")
    private String name;
    @NotBlank(message = "the department is required")
    private  String department;
    @NotNull(message = "the salary is required")
    private  double salary;

    public EmployeeDTO()
    {

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public EmployeeDTO(String name, String department, double Salary)
    {
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
