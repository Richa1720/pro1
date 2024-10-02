package com_spring_boot_pro1.pro1.controller;

import com_spring_boot_pro1.pro1.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController
public class ResponseBodyTest {




    @RequestMapping("/resbody/{uid}/{name}")
    @ResponseBody
    public String getIdThroughResponseBody(@PathVariable("uid") int id,@PathVariable String name)
    {
        return "id = "+id +" Name : "+name;
    }


    //passing object
    @RequestMapping("/resbodyobj")
    @ResponseBody
    public Student getCompleteObject(@RequestBody Student student)
    {
        return student;
    }

}
