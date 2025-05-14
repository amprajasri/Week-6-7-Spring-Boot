package com.example.EmployeeManagement;
import java.util.List;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeServiceImplementation employeeServiceImplementation;

    @PostMapping
    public Employee add(@RequestBody @Valid EmployeeDTO e)
    {
        return employeeServiceImplementation.add(e);

    }

    @GetMapping
    public List<Employee> getEmployee()
    {
        return  employeeServiceImplementation.getEmployees();
    }

    @DeleteMapping("/{id}")
    public void  deleteEmployee(@PathVariable int id)
    {
        employeeServiceImplementation.removeEmployee(id);
    }
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable int id,@RequestBody @Valid EmployeeDTO e)
    {
        return  employeeServiceImplementation.updateEmployee(id,e);
    }
}
