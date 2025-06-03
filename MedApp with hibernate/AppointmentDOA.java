package com.example.dao;
import com.example.util.JpaUtil;
import com.example.model.Patient;
import com.example.model.Doctor;
import jakarta.persistence.EntityManager;
import java.time.LocalDate;
import com.example.model.Appointment;
public class AppointmentDOA {

    public void bookAppointment(LocalDate date, int patientId, int doctorId)
    {
        EntityManager em = JpaUtil.getEmf();
        try{
            em.getTransaction().begin();

            Patient patient = em.find(Patient.class, patientId); //looks in the database for a row in the Patient table where id = patientId, and returns it as a Patient object
            Doctor doctor = em.find(Doctor.class, doctorId);

            if(patient == null || doctor == null)
            {
                System.out.println("Invalid patient or doctor id");
                em.getTransaction().rollback(); //undo any changes made during a transaction if something goes wrong
                return;
            }

            Appointment appointment = new Appointment();
            appointment.setAppointmentDate(date);
            appointment.setPatient(patient);
            appointment.setDoctor(doctor);

            em.persist(appointment);
            em.getTransaction().commit();
            System.out.println("Appointment created");
            
        }finally{
            em.close();
        }
    }

    public void deleteAppointment(int appointmentID)
    {
        EntityManager em = JpaUtil.getEmf();
        try{
           em.getTransaction().begin();

           Appointment app = em.find(Appointment.class, appointmentID);

           if(app == null)
           {
                System.out.println("Appointment not found");
                em.getTransaction().rollback();
                return;
           }

           em.remove(app);
           em.getTransaction().commit();
        }finally
        {
            em.close();
        }
    }
}
