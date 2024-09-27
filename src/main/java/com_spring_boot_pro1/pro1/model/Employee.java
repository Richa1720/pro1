package com_spring_boot_pro1.pro1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "employee_tbl")
public class Employee {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private double salary;
    private String exp;

    public Employee() {
    }

    //constructor
    public Employee(String name, double salary, String exp) {
        this.name = name;
        this.salary = salary;
        this.exp = exp;
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }
}
