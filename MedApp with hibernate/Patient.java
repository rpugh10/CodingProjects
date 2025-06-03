package com.example.model;

import jakarta.persistence.*;


@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
     
    private String email;
    
    private long phone;
 
    public Patient(){

    }

    public Patient(String name, String email, long phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public long getID()
    {
        return id;
    }

    public void setID(long id)
    {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String toString()
    {
        return "Name: " + name + "\n" + "Email: " + email + "\n" + "Phone: " + phone + "\n";
    }

}
