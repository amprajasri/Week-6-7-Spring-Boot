package com.example.EmployeeManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee add(EmployeeDTO e) {

       Employee emp=new Employee();
       emp.setName(e.getName());
       emp.setDepartment(e.getDepartment());
       emp.setSalary(e.getSalary());
        return employeeRepository.save(emp);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(int id, EmployeeDTO employee) {
        Employee e=employeeRepository.findById(id).orElse(null);
        if(e!=null)
        {
            e.setName(employee.getName());
            e.setDepartment(employee.getDepartment());
            e.setSalary(employee.getSalary());
            return employeeRepository.save(e);
        }
        return null;
    }

    @Override
    public void removeEmployee(int id) {
       employeeRepository.deleteById(id);
    }
}
