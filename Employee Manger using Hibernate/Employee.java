package jpa.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
 
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String fName;

    @Column(name = "last_name")
    private String lName;

    @ManyToOne //Many employees can belong to one department
    @JoinColumn(name = "department_id") //Each Employee is associated with one Department. Use the department_id column in the employee table to link to the Department's id."
    private double salary;

    @ManyToOne(fetch = FetchType.LAZY) // The department object will not be fetched from the database when you load the Employee — only the department_id will be known.
    @JoinColumn(name = "department_id")
    private Department department;
    
    public Employee(){

    }

    public Employee(String fName, String lName, double salary)
    {
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
    }

    public void setID(long id)
    {
        this.id = id;
    }

    public void setFName(String fName)
    {
        this.fName = fName;
    }

    public void setLName(String lName)
    {
        this.lName = lName;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public void setDepartment(Department department)
    {
        this.department = department;
    }

    public long getID()
    {
        return id;
    }

    public String getFName()
    {
        return fName;
    }

    public String getLName()
    {
        return lName;
    }

    public double getSalary()
    {
        return salary;
    }

    public Department getDepartment()
    {
        return department;
    }

    public String toString()
    {
        return "ID: " + id + "\n" + "First Name: " + fName + "\n" + "Last Name: " + lName + "\n" + "Salary: " + salary + "\n" + "Department: " + department + "\n";
    }
}
