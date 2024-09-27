package com_spring_boot_pro1.pro1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
/*@ResponseStatus*/

@Controller
@ResponseBody
public class PVPrimeNumber {

    @RequestMapping("/prime/{num}")
    public String getPrime(@PathVariable int num)
    {
     int count=0;
        for(int a=1;a<=num;a++)
        {
            if(num%a==0)
            {
                count++;
                break;

            }
        }
        if(count==2)
        {
            return "Given number is prime";
        }
        else
        {
            return "Number is non prime";
        }

    }

    /*
   //  int count=0;
        int a=0;
        for(a=2;a<num;a++) {
            if (num % a == 0) {
                //count++;
                break;
            }
        }
        if(a==num)
        {
            return "Given number is prime";
        }
        else
        {
            return "Number is non prime";
        }*/
}
