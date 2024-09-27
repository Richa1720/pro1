package com_spring_boot_pro1.pro1.controller;

import com_spring_boot_pro1.pro1.model.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class DoctorControllerCRUD {

    ArrayList<Doctor> doctorArrayList=new ArrayList<>();

    //CREATE
    @RequestMapping(value="/add_doctor",method= RequestMethod.POST)
    public String addDoctor(@RequestBody Doctor doctor)
    {
        doctorArrayList.add(doctor);

        return "Doctor record added successfully through RequestBody";
    }

    //READ

    @RequestMapping(path="/get_doctor",method=RequestMethod.GET)
    public ArrayList<Doctor> getDoctor()
    {
        return doctorArrayList;
    }

    //PUT
    @RequestMapping(value="/update_doctor/{name}/{fee}/{specialization}",method=RequestMethod.PUT)
    public String updateDoctor(@PathVariable String name,@PathVariable int fee, @PathVariable String specialization,@RequestParam int index)
    {
            Doctor doctor=doctorArrayList.get(index);
            doctor.setName(name);
            doctor.setFee(fee);
            doctor.setSpecialization(specialization);

            return "Doctor record updated successfully...";
    }

    //DELETE

    @RequestMapping(path="/delete_doctor",method=RequestMethod.DELETE)
    public String deleteDoctor(@RequestParam int index)
    {
        doctorArrayList.remove(index);
        return "Doctor record deleted at given index ";
    }
}
