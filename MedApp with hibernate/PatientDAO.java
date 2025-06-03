package com.example.dao;
import com.example.util.JpaUtil;
import com.example.model.Patient;
import jakarta.persistence.*; 
import java.util.*;
public class PatientDAO {

    public void savePatient(Patient patient)
    {
        EntityManager em = JpaUtil.getEmf();
        try{
            em.getTransaction().begin();
            em.persist(patient);
            em.getTransaction().commit();
        }finally{
            em.close();
        }
    }

    public List<Patient> getAllPatients()
    {
        EntityManager em = JpaUtil.getEmf();
        try{
            em.getTransaction().begin();
            TypedQuery<Patient> query = em.createQuery("SELECT e FROM Patient e", Patient.class);
            return query.getResultList();
        }finally{
            em.close();
        }
    }
}
