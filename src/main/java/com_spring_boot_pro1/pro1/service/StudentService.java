package com_spring_boot_pro1.pro1.service;

import com_spring_boot_pro1.pro1.model.Student;
import com_spring_boot_pro1.pro1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    //@Autowired
    StudentRepository studentRepository;

    //CREATE
    public String add(Student student)
    {
        studentRepository.save(student);  //insert data into the database
        return "Student saved to the DB successfully..";
    }

    //READ
    public List<Student> getAllStudents()
    {
        List<Student> stds=studentRepository.findAll();  //get all the data from the table

        return stds;
    }

    //UPDATE
    public String updateStudent(long id,String name)
    {
        //1 find out record
        Student student=studentRepository.getById(id);  //fetch student data from database

        //2 update the value and save ti database .
        student.setName(name);
        studentRepository.save(student);  //

        return "student updated successfully...  "+name;
    }

    //DELETE
    public String deleteStudent(long id)
    {
        studentRepository.deleteById(id);  //it will delete record form the Database

        return "student deleted successfully...";
    }

    //READ  USER-DEFINED METHOD
    public Student findByName(String name)
    {
        return studentRepository.findByName(name);
    }

    //READ UD
    public List<Student> findByAge(int age)
    {
        return studentRepository.findByAge(age);
    }
}
