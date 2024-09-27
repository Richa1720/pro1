package com_spring_boot_pro1.pro1.controller;


import com_spring_boot_pro1.pro1.service.AppFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppFlowController {

    @Autowired
    AppFlowService appFlowService;

    @GetMapping("/app_flow")
    public String appFlow()
    {
        //return "Hello from AppFlowController...";
        /* 1st way to get service class method was to create object of it
        *  AppFlowService obj=new AppFlowService();
        *   obj.appFlow();
        * */

        return appFlowService.appFlow();
    }


}
