package com_spring_boot_pro1.pro1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PVAssignment {

    //calculating square
    @RequestMapping("/square/{a}")
    public String getSquare(@PathVariable int a)
    {

        int square=a*a;
        return "Square of given number is "+square;
    }

    //calculating cube
    @RequestMapping("/cube/{a}")
    public String getCube(@PathVariable int a)
    {
        int cube=a*a*a;
        return "Cube of given number is "+cube;
    }

    //even and odd check

    @RequestMapping("/eve/odd/{num}")
    public String checkEvenOdd(@PathVariable int num)
    {
        if(num%2!=0)
        {
            return "Given number is Odd";
        }
        else
        {
            return "Given number is Even";
        }
    }



}
