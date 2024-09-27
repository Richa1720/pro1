package com_spring_boot_pro1.pro1.controller;


import com_spring_boot_pro1.pro1.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
//@RequestMapping("/student/crud")   working
public class StudentCRUD {

    //CRUD Operation
    ArrayList<Student> studentArrayList=new ArrayList<>();


    //CREATE Adding full Student object API ,instead of passing separate fields name, we prefer TO PASS (student) object to avoid mistakes.
    @RequestMapping(value="/add_std_obj",method=RequestMethod.POST)
    public String add_Student(@RequestBody Student student)
    {
        studentArrayList.add(student);
        return "successfully added student object using Request body ";
    }


    //CREATE/Add END POINT  (Data given in code)
    @RequestMapping("/student1")
    public String  add()
    {
        Student student1=new Student("Denver",26,"B");
        studentArrayList.add(student1);

        return "Student added successfully ,arguments given in constructor...";
    }

    //CREATE (Dynamic Data from browser)

    @RequestMapping("/stdynamic/{name}/{age}/{sec}")
    public String addDynamic(@PathVariable String name,@PathVariable int age,@PathVariable String sec)
    {
        Student st=new Student(name,age,sec);
        studentArrayList.add(st);

        return "Student added successfully to the arraylist using PathVariable";
    }

    //READ
    @RequestMapping(value="/students",method=RequestMethod.GET)
    public ArrayList<Student> getStudentArrayList()
    {
        return studentArrayList;
    }

    //UPDATE (In array list we can update student on the basis of index)

    @RequestMapping(value="/updatestd/",method=RequestMethod.PUT)
    public String updateName(@RequestParam String name, @RequestParam int index)
    {
        Student student=studentArrayList.get(index);
        student.setName(name);
        return "student name Updated successfully";
    }

    //DELETE
    @RequestMapping(value="/delete/student",method=RequestMethod.DELETE)
    public String deleteStudentFromList(@RequestParam int index)
    {
        studentArrayList.remove(index);
        return "student deleted from an array list successfully";
    }

    //we can update all fields as well
    @RequestMapping("/updateall")
    public String updateStudent(@RequestParam String name,@RequestParam int age,@RequestParam String sec,@RequestParam int index)
    {
        Student student=studentArrayList.get(index);
        student.setName(name);
        student.setAge(age);
        student.setSection(sec);
        return "student name Updated successfully";
    }
}
