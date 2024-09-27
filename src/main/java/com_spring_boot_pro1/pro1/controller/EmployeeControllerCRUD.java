package com_spring_boot_pro1.pro1.controller;

import com_spring_boot_pro1.pro1.model.Employee;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import java.util.ArrayList;

@RestController
public class EmployeeControllerCRUD {

    ArrayList<Employee> employeeArrayList=new ArrayList<Employee>();

    //CREATE
    @PostMapping("/add_emp")
    public String addEmployee(@RequestBody Employee employee)
    {
        employeeArrayList.add(employee);
        return "Employee added successfully in Array list using RequestBody";
    }

    //READ
    @GetMapping("/get_emp")
    public ArrayList<Employee> getEmployees()
    {
        return employeeArrayList;
    }

    //UPDATE
    @PutMapping("/update_emp")
    public String updateEmployee(@RequestParam String name,@RequestParam double salary,@RequestParam String exp,@RequestParam int index)
    {
        Employee employee=employeeArrayList.get(index);
        employee.setName(name);
        employee.setSalary(salary);
        employee.setExp(exp);
        return "employee updated successfully at given index...";
    }

    @DeleteMapping("/del_emp")
    public String deleteEmployee(@RequestParam int index)
    {
        employeeArrayList.remove(index);
        return "employee deleted at given index...";
    }
}
