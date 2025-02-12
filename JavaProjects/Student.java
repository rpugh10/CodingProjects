import java.io.*;
public class Student implements Serializable
{
    private String name;
    private int age;
    private double gpa;
    private static final long serialVersionUID = 1L;

    public Student(String name, int age, double gpa)
    {
        
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void display()
    {
        System.out.println(name + " " + age + " " + gpa);
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public double getGpa()
    {
        return gpa;
    }

}



 
