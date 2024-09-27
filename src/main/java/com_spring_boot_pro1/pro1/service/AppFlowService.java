package com_spring_boot_pro1.pro1.service;

import com_spring_boot_pro1.pro1.repository.AppFlowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppFlowService {

    @Autowired
    AppFlowRepo appFlowRepo;

    public String appFlow()
    {
        //return "Hello, from AppFlowService ...";
        return appFlowRepo.appFlow();
    }
}
