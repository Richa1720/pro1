package com_spring_boot_pro1.pro1.controller;

import com_spring_boot_pro1.pro1.model.Student;
import com_spring_boot_pro1.pro1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentDBController {

    //@Autowired
    StudentService studentService;

    //CREATE
    @PostMapping("/add_std_db")
    public String add_Student(@RequestBody Student student)
    {
        return studentService.add(student);
    }

    //READ
    @GetMapping("/get_std_list")
    public List<Student> getStudents()
    {
        List<Student> students=studentService.getAllStudents();
        return students;
    }

    //UPDATE

    @PutMapping("/update_std")
    public String updateStudent(@RequestParam long id,@RequestParam String name)
    {
        return studentService.updateStudent(id,name);
    }

    //DELETE

    /*public String deleteStudent()
    {
        return studentService.
    }*/

    //DELETE
    @DeleteMapping("/delete_student")
    public String delStudent(@RequestParam long id)
    {
        return studentService.deleteStudent(id);
    }

    //READ USER-DEFINED METHOD
    @GetMapping("/findbyname")
    public Student findByName(@RequestParam String name)
    {
        return studentService.findByName(name);
    }

    //READ UD Method
    @GetMapping("findbyage")
    public List<Student> findByAge(@RequestParam int age)
    {
        return studentService.findByAge(age);
    }

}
