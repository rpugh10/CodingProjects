package jpa.example.dao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jpa.example.model.*;
import jpa.example.util.JPAUtil;

import java.math.BigDecimal;
import java.util.*;

public class EmployeeDao {

    public void save(Employee employee)
    {
        EntityManager em = JPAUtil.getEntityManager();
            try{
                em.getTransaction().begin();
                em.persist(employee);
                em.getTransaction().commit();
            }finally{
                em.close();
            }
    }

    public Employee findById(Long id)
    {
        EntityManager em = JPAUtil.getEntityManager();
        try{
            return em.find(Employee.class, id);
        }finally{
            em.close();
        }
    }

    public List<Employee> findAll()
    {
        EntityManager em = JPAUtil.getEntityManager();
        try{
            TypedQuery<Employee> query = em.createQuery("SELECT e FROM Employee e", Employee.class);
            return query.getResultList();
        }finally{
            em.close();
        }
    }

    public void delete(Employee e)
    {
        EntityManager em = JPAUtil.getEntityManager();
        try{
            em.getTransaction().begin();
            Employee toRemove = em.merge(e);
            em.remove(toRemove);
            em.getTransaction().commit();
        }finally{
            em.close();
        }
    }

    public void update(Employee e)
    {
        EntityManager em = JPAUtil.getEntityManager();
        try{
            em.getTransaction().begin();;
            em.merge(e);
            em.getTransaction().commit();
        }finally{
            em.close();
        }
    }

    public List<Employee> findSalaryGreaterThan(BigDecimal min)
    {
        EntityManager em = JPAUtil.getEntityManager();
        try{ // Use :min that tells hibernate I will give you a value for min in the runtime
            TypedQuery<Employee> query = em.createQuery("SELECT e FROM Employees e WHERE e.salary > :min", Employee.class);
            query.setParameter("min", min); //Sets the actual value for the named parameter in the query
            return query.getResultList();
        }finally{
            em.close();
        }
    }
}
