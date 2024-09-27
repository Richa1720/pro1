package com_spring_boot_pro1.pro1.controller;

import com_spring_boot_pro1.pro1.model.Employee;
import com_spring_boot_pro1.pro1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeDBController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee_add")
    public String add(@RequestBody Employee employee)
    {
        employeeService.add(employee);
        return "Employee added successfully...";
    }



}
