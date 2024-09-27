package com_spring_boot_pro1.pro1.controller;

import com_spring_boot_pro1.pro1.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {


    @RequestMapping("/emp")
    public Employee getEmployee()
    {
        Employee obj=new Employee("Shekhar Verma",85000,"2 years");
        return obj;
    }

    @RequestMapping("/employees")
    public ArrayList<Employee> getEmployees()
    {
        ArrayList<Employee> list=new ArrayList<Employee>();
        Employee emp1=new Employee("Ruksaar",45000,"3 years");
        Employee emp2=new Employee("Anamika",65000,"5 years");
        Employee emp3=new Employee("Nikhil",500000,"2 years");
        Employee emp4=new Employee("kritika",200000,"1 years");
        Employee emp5=new Employee("Ajay",70000,"3 years");

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);

        return list;


    }

    @RequestMapping("/getfirstemp")
    public Employee getFirstEmployee()
    {
        ArrayList<Employee> list=new ArrayList<Employee>();
        Employee emp1=new Employee("Ruksaar",45000,"3 years");
        Employee emp2=new Employee("Anamika",65000,"5 years");
        Employee emp3=new Employee("Nikhil",500000,"2 years");
        Employee emp4=new Employee("kritika",200000,"1 years");
        Employee emp5=new Employee("Ajay",70000,"3 years");

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);

        Employee emp=list.get(0);
        //return list.get(1);
        return emp;
    }
}
