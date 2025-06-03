package com.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String specialization;

    private String availableDays;

    public Doctor(){

    }

    public Doctor(String name, String specialization, String availableDays)
    {
        this.name = name;
        this.specialization = specialization;
        this.availableDays = availableDays;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getAvailableDays() {
        return availableDays;
    }

    public void setAvailableDays(String availableDays) {
        this.availableDays = availableDays;
    }

    @Override
    public String toString() {
        return "Doctor name: " + name + "\n" + "Specialization: " + specialization + "\n" + "AvailableDays: " + availableDays + "\n";
    }

    

}
