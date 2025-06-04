package com.example;
import com.example.model.*;
import com.example.dao.*;

import java.time.LocalDate;
import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        PatientDAO pDAO = new PatientDAO();
        DoctorDAO dDAO = new DoctorDAO();
        AppointmentDOA aDAO = new AppointmentDOA();
        
        while(true)
        {
            System.out.println("1. Add Patent");
            System.out.println("2. Add Doctor");
            System.out.println("3. View all patients");
            System.out.println("4. Get doctors by specialization");
            System.out.println("5. Book appointment");
            System.out.println("6. Delete appointment");
            System.out.println("7. Get appointment by doctor");
            System.out.println("8. Exit");
            int input = scan.nextInt();
            scan.nextLine();

            if(input == 1)
            {
                System.out.println("Enter patient name: ");
                String name = scan.nextLine();
                System.out.println("Enter patient email: ");
                String email = scan.nextLine();
                System.out.println("Enter patient phone number: ");
                long number = scan.nextLong();
                scan.nextLine();
                Patient patient = new Patient(name, email, number);
                pDAO.savePatient(patient);
                System.out.println("Patient saved");
            }
            else if(input == 2)
            {
                System.out.println("Enter doctor name: ");
                String name = scan.nextLine();
                System.out.println("Enter specialization: ");
                String s = scan.nextLine();
                System.out.println("Enter number of days available: ");
                int days = scan.nextInt();
                scan.nextLine();
                Doctor doctor = new Doctor(name, s, days);
                dDAO.saveDoctor(doctor);
            }
            else if(input == 3)
            {
                for(Patient p: pDAO.getAllPatients())
                {
                    System.out.println(p.getName() + " " + p.getEmail() + " " + p.getPhone());
                }
            }
            else if(input == 4)
            {
                System.out.println("Enter specialization: ");
                String specialization = scan.nextLine();
                List<Doctor> list = dDAO.getDoctorBySpecialization(specialization);
                if(list.isEmpty())
                {
                    System.out.println("No doctor found with " + specialization + " specialization");
                }
                else{
                    for(Doctor d: list)
                    {
                        System.out.println(d.getName());
                    }
                }
            }
            else if(input == 5)
            {
                System.out.println("Enter date (yyyy-MM-dd): ");
                String date = scan.nextLine();
                LocalDate dates = LocalDate.parse(date);
                System.out.println("Enter patient id: ");
                int pID = scan.nextInt();
                scan.nextLine();
                System.out.println("Enter doctor id: ");
                int dID = scan.nextInt();
                scan.nextLine();
                aDAO.bookAppointment(dates, pID, dID);
            }
            else if(input == 6)
            {
                System.out.println("Enter appointment id: ");
                int aID = scan.nextInt();
                scan.nextLine();
                aDAO.deleteAppointment(aID);
            }
            else if(input == 7)
            {
                System.out.println("Enter doctor id: ");
                int dID = scan.nextInt();
                scan.nextLine();
                List<Appointment> list = aDAO.getAppointmentsByDoctor(dID);
                if(list == null || list.isEmpty())
                {
                    System.out.println("Doctor with id " + dID + " has no appointments");
                }
                else{
                    for(Appointment a: list)
                    {
                        System.out.println(a.getAppointmentDate() + " " + a.getPatient() + " " + a.getDoctor());
                    }
                }
            }
            else
            {
                System.out.println("Exiting");
                break;
            }
        }
        scan.close();
        
    }
}
