package com_spring_boot_pro1.pro1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {

    //SYNTAX - endpoint?param_name=value    in URL

    @RequestMapping("/info")
    public String information(@RequestParam String name)
    {
        return "This is spring boot app with Request Param "+name;
    }

    @RequestMapping("/skill")
    public String skills(@RequestParam String name,@RequestParam String skill)
    {
        return "This person "+name+" has skills :"+skill;
    }

    //we can also pass  in @RequestParam("name1") like given below
    // or same like parameter given @RequestParam("name")
    //URL  http://localhost:8181/pro?name1=Kritika&pro1=PR
    //but if we are creating @RequestParam("name1") parameter then only this is used to work else error
    @RequestMapping("/pro")
    public String profession(@RequestParam("name1") String name,@RequestParam("pro1") String profession)
    {
        return "This person : "+name+" is : "+profession;

    }

    //URL ---http://localhost:8181/std?roll=17&name=Shanaya&sec=A&percent=86.5
    @RequestMapping("/std")
    public String studentData(@RequestParam int roll,@RequestParam String name,@RequestParam char sec,@RequestParam double percent)
    {
        return "Student details are : "+"roll : "+roll+" Name : "+name+" Section : "+sec+" Percentage : "+percent;
    }

}
