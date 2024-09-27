package com_spring_boot_pro1.pro1.controller;

import com_spring_boot_pro1.pro1.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

// @RestController-> combination of @Controller + @ResponseBody
@RestController  //use to make class a controller to handle requests
public class DemoController {

    //access_specifier return_Type method_Name(input parameters){CODE}

//TODO- Always remember to make unique endpoints ....................................

    //@RequestMapping("/hello")
    @RequestMapping("hello")      //it's working without applying slash in endpoint(but follow convention)
    public void helloMethod()
    {
        System.out.println("Hello, Welcome to Spring Boot......");
    }

    @RequestMapping("welcome")
    public String helloMethod2()
    {
        //String welcome="Hello, Welcome to Spring Boot......";

        return "Hello, Welcome to Spring Boot......";
    }

    //courses  ArrayList
    @RequestMapping("/courses")
    public ArrayList<String> getCourses()
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("SpringBoot");
        list.add("Microservices");
        list.add("Scala");
        list.add("docker");
        list.add("spring mvc");

        return list;
    }

    //Databases LinkedList

    @RequestMapping("/databases")
    public LinkedList<String> getDatabases()
    {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("MYSQL");
        ll.add("SQL SERVER");
        ll.add("ORACLE");
        ll.add("MONGODB");
        ll.add("POSTGRES");

        return ll;
    }

    //HashSet
    @RequestMapping("/")
    public HashSet<String> getLang()
    {
        HashSet<String> set=new HashSet<String>();
        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("Python");
        set.add("Java Script");
        set.add("Node js");
        return  set;
    }

    //Hash Map
    @RequestMapping("/dura")
    public HashMap<String,String> getCoursesDuration()
    {
        HashMap<String,String> map=new HashMap<>();
        map.put("B.tech","4 years");
        map.put("B.ca","3 years");
        map.put("M.bbs","5 to 5.5 years");
        map.put("B.ds","5 years");
        return map;

    }

    //to get student object
    @RequestMapping("/student")
    public Student getStudent()
    {
        Student obj=new Student("Kritika",23,"B");

        return obj;
    }

}
