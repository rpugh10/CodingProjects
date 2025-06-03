package com.example.dao;
import com.example.model.Doctor;
import com.example.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.*;
public class DoctorDAO {

    public void saveDoctor(Doctor doc)
    {
        EntityManager em = JpaUtil.getEmf();
        try{
            em.getTransaction().begin();
            em.persist(doc);
            em.getTransaction().commit();
        }finally{
            em.close();
        }
    }

    public List<Doctor> getDoctorBySpecialization(String specialization)
    {
        EntityManager em = JpaUtil.getEmf();
        try{
            em.getTransaction().begin();
            TypedQuery<Doctor> query = em.createQuery("SELECT e FROM Doctor e WHERE e.specialization = :specialization", Doctor.class);
            query.setParameter("specialization", specialization);
            return query.getResultList();
        }finally{
            em.close();
        }
    }
}
