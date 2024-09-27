package com_spring_boot_pro1.pro1.service;

import com_spring_boot_pro1.pro1.model.Employee;
import com_spring_boot_pro1.pro1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String add(Employee employee)
    {
        employeeRepository.save(employee);

        return "Employee added successfully...";
    }




}
