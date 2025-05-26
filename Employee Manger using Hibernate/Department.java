package jpa.example.model;

import java.util.*;

import jakarta.persistence.*;

@Entity
@Table(name = "department")
public class Department {
    
    private long id;

    private String name;

    //@OneToMany means one department has many employees
    @OneToMany(mappedBy ="department", // This makes it a bidirectional relationship, and "department" refers to the department field inside the Employee class
    cascade = CascadeType.ALL, //This means that all operations (e.g., persist, merge, remove) will cascade from the Department to its employees
    orphanRemoval = true) // If an Employee is removed from the employees list, and the change is committed, that Employee will be deleted from the database.
    private List<Employee> employees = new ArrayList<>();

    public Department()
    {

    }

    public Department(String name)
    {
        this.name = name;
    }

    public void setID(long id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void addEmployee(Employee em)
    {
        employees.add(em);
        em.setDepartment(this);
    }

    public void removeEmployee(Employee em)
    {
        employees.remove(em);
        em.setDepartment(null);
    }

    public long getID()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public List<Employee> getEmployees()
    {
        return employees;
    }

    public String toString()
    {
        return "ID: " + id + "\n" + "Name: " + name + "\n" + "Employees: " + employees + "\n";
    }
}
