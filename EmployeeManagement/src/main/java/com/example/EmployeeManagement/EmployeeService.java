package com.example.EmployeeManagement;

import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
   Employee add(EmployeeDTO e);
   List<Employee> getEmployees();
   Employee updateEmployee(int id,EmployeeDTO e);
   void removeEmployee(int id);

}