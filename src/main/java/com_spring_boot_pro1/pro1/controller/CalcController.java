package com_spring_boot_pro1.pro1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

   /* @RequestMapping("/add")
    public int add()
    {
        int a=20;
        int b=34;
        int sum=a+b;

        return sum;

    }*/
//TODO --> to make it more meaningful or understandable on browser make it String as return type

    @RequestMapping("/add")
    public String add()
    {
        int a=20;
        int b=34;
        int sum=a+b;

        return "Addition is : "+sum;

    }
    @RequestMapping("/sub")
    public String sub()
    {
        int a=23;
        int b=45;
        int sub=b-a;

        return "Subtraction is : "+sub;

    }

    @RequestMapping("/multi")
    public String multi()
    {
        int a=25;
        int b=5;
        int mul=a*b;

        return "Multiplication is : "+mul;

    }

    @RequestMapping("/div")
    public String div()
    {
        int a=729;
        int b=7;
        double div=(double)a/b;

        return "Division is : "+div;

    }
}
