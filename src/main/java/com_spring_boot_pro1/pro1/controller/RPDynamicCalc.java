package com_spring_boot_pro1.pro1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class RPDynamicCalc {


    @RequestMapping("/addition")
    public String  add(@RequestParam("a") int a, @RequestParam("b") int b)
    {
        return "Addition is "+(a+b);
    }

    @GetMapping()  //working   URL http://localhost:8181/?a=91&b=45
    public String sub(@RequestParam("a") int a,@RequestParam("b") int b)  //{} braces are not allowed her
    {
        return "Subtraction is "+(a-b);
    }


    @GetMapping("/multiplication")  //URL http://localhost:8181/multiplication?a=21&b=2
    public String mul(@RequestParam int a,@RequestParam int b)
    {
        return "Multiplication is "+(a*b);
    }

    @PostMapping   //URL -localhost:8181/?a=15&b=2     OUTPUT Deletion is 7.5
    public String del(@RequestParam int a,@RequestParam int b)
    {
        double del=(double)a/b;
        return "Deletion is "+del;
    }

    @PutMapping  //URL -localhost:8181/?a=15&b=2   OUTPUT Deletion is 7.5
    public String del2(@RequestParam int a,@RequestParam int b)
    {
        double del=(double)a/(double)b;
        return "Deletion is "+del;
    }

    @DeleteMapping  //URL -localhost:8181/?a=15&b=2    OUTPUT  Deletion is 7.5
    public String del3(@RequestParam int a,@RequestParam int b)
    {
        double del=(double)a/b;
        return "Deletion is "+del;
    }


    //URL  -localhost:8181/deletion/get?a=15&b=2     OUTPUT  Deletion is : 7.5
    @GetMapping("/deletion/get")   //gave end point b'coz GetMapping is already used
    public String del4(@RequestParam int a, @RequestParam int b)
    {
        double del=a/(double)b;
        return "Deletion is : "+del;
    }



}
