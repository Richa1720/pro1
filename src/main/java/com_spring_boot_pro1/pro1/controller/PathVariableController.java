package com_spring_boot_pro1.pro1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

//TODO - PathVariable is used to retrieve input values or get dynamic data from url path to our code
//Remember pathVariableName and input parameters name must be same otherwise error will be occurred
//SYNTAX : "/endpoint/{PathVariableName}"
    @RequestMapping("/msg/{name}")
    public String mssge(@PathVariable String name)
    {
        return name+" Welcome you on your spring app... ";
    }


//SYNTAX : "/endpoint/{Variable1/{Variable2}}"


/*  WRONG SYNTAX @RequestMapping("/vote/{n}/{a}")    names must be identical to formal parameters*/
    @RequestMapping("/vote/{name}/{age}")
    public String eligibility(@PathVariable String name,@PathVariable int age)
    {
        if(age>18)
        {
            return name+" is eligible for voting...";
        }

        else
        {
            return name+" is not eligible for voting...";
        }
    }


}
