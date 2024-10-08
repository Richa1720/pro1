package com_spring_boot_pro1.pro1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.GetMapping;

@Entity(name="student_tbl")
public class Student {

    @Id
    @GeneratedValue
    long id;  //primary key of Table 1,2,3,4....
    String name;
    int age;
    @Column(name="stream")  //to rename any column
    String section;

    //default constructor
    public Student() {
    }

    public Student(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
    }

    //constructor
    public Student(long id, String name, int age, String section) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.section = section;
    }

    //getter and setter


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
