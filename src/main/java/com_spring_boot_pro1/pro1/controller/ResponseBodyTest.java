package com_spring_boot_pro1.pro1.controller;

import com_spring_boot_pro1.pro1.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController
public class ResponseBodyTest {

    /*Java code written in NewBranchPro
     * .................
     * .................
     * Code Given in multiline comments    */


    @RequestMapping("/resbody/{uid}/{name}")
    @ResponseBody
    public String getIdThroughResponseBody(@PathVariable("uid") int id,@PathVariable String name)
    {
        return "id = "+id +" Name : "+name;
    }

    /*Now this time adding java comments into the master branch
    * .......................................................
    * ..................................................
    * .......and pushed to our remote */

    //passing object
    @RequestMapping("/resbodyobj")
    @ResponseBody
    public Student getCompleteObject(@RequestBody Student student)
    {
        return student;
    }


    /*Now this time adding java comments to varshatestbranch branch
     * .......................................................
     * ..................................................
     * .......and pushed to our remote */

}
