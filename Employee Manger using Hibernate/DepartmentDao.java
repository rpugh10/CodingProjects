package jpa.example.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jpa.example.model.Department;
import jpa.example.util.JPAUtil; 
import java.util.*;
import jpa.example.model.Employee; 


public class DepartmentDao {

    public void save(Department department)
    {
        EntityManager em = JPAUtil.getEntityManager();
            try{
                em.getTransaction().begin(); //Get transaction and start it
                em.persist(department); // Send what is passed to the db
                em.getTransaction().commit(); //Finalizes the transaction
            }finally{
                em.close();
            }
    }

    public Department findById(Long id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Department.class, id);
        } finally {
            em.close();
        }
    }

    public Department findDepartmentWithEmployees(Long id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            TypedQuery<Department> query = em.createQuery(
                "SELECT d FROM Department d JOIN FETCH d.employees WHERE d.id = :id", Department.class);
            query.setParameter("id", id);
            return query.getSingleResult();
        } finally {
            em.close();
        }
    }

    public List<Department> findAll()
    {
        EntityManager em = JPAUtil.getEntityManager();
        try{
            TypedQuery<Department> query = em.createQuery("SELECT d FROM Department d", Department.class);
            return query.getResultList();
        }finally{
            em.close();
        }
    }

    public void update(Department department)
    {
        EntityManager em = JPAUtil.getEntityManager();
        try{
            em.getTransaction().begin();
            em.merge(department); //Updating the row in the db
            em.getTransaction().commit();
        }finally{
            em.close();
        }
    }

    public void delete(Department department)
    {
        EntityManager em = JPAUtil.getEntityManager();
        try{
            em.getTransaction().begin();
            Department toRemove = em.merge(department); //This makes sure the department is managed by the EntityManger 
            em.remove(toRemove); //Then removes the department
            em.getTransaction().commit();
        }finally{
            em.close();
        }
    }

    public Department findByName(String name)
    {
        EntityManager em = JPAUtil.getEntityManager();
        try{
            TypedQuery<Department> query = em.createQuery("SELECT d FROM Department d WHERE d.name = :name", Department.class);
            query.setParameter("name", name);
            List<Department> department = query.getResultList(); 
            return department.isEmpty() ? null : department.get(0); //if department is empty return null else if department is not empty return index 0
        }finally{
            em.close();
        }
    }

    public void addEmployeeToDepartment(Department d, Employee e)
    {
        EntityManager em =JPAUtil.getEntityManager();
        try{
            em.getTransaction().begin();
            Department mDepartment = em.merge(d);
            mDepartment.addEmployee(e);
            em.persist(e);
            em.getTransaction().commit();
        }finally{
            em.close();
        }
    }
}
