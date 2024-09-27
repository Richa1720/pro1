package com_spring_boot_pro1.pro1.model;

public class Doctor {

    private String name;
    private int fee;
    private String specialization;

    //constructor
    public Doctor(String name, int fee, String specialization) {
        this.name = name;
        this.fee = fee;
        this.specialization = specialization;
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
