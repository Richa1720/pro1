package com_spring_boot_pro1.pro1.repository;

import com_spring_boot_pro1.pro1.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    //if there is nothing in repository which means it only provide basic functions
    // For any required method you have to manually create a user defined method

    //READ finding student data on the basis of its name
    public Student findByName(String name);

    //Read 2
    public List<Student> findByAge(int age);

}
