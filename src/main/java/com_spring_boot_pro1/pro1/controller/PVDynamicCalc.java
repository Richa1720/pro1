package com_spring_boot_pro1.pro1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@PathVariable is used to give values on run time in url
@RestController
public class PVDynamicCalc {

/* @RequestMapping("/add/{a1}/{b1}/{c1}")
    public String add(@PathVariable("a1") int a,@PathVariable("b1") int b,@PathVariable("c1") int c)*/


    @RequestMapping("/add/{a}/{b}/{c}")
    public String add(@PathVariable int a,@PathVariable int b,@PathVariable int c)
    {
        int sum=a+b+c;

        return "Addition is : "+sum;

    }
    @RequestMapping("/sub/{a}/{b}")
    public String sub(@PathVariable int a,@PathVariable int b)
    {
        int sub=b-a;

        return "Subtraction is : "+sub;

    }

    @RequestMapping("/multi/{a}/{b}")
    public String multi(@PathVariable int a, @PathVariable int b)
    {
        int mul=a*b;

        return "Multiplication is : "+mul;

    }

    @RequestMapping("/div/{a}/{b}")
    public String div(@PathVariable int a,@PathVariable int b)
    {
        double div=(double)a/b;

        return "Division is : "+div;

    }

}
