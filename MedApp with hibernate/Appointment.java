package com.example.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "appointment")
public class Appointment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDate appointmentDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    public Appointment(){

    }

    public Appointment(LocalDate appointmentDate, Patient patient, Doctor doctor) {
        this.appointmentDate = appointmentDate;
        this.patient = patient;
        this.doctor = doctor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "AppointmentDate: " + appointmentDate + "\n" + "Patient: " + patient + "\n" + "Doctor: " + doctor + "\n";
    }

    
}
