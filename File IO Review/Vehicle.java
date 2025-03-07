import java.io.*;
public class Vehicle implements Serializable
{   
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getDetails()
    {
        return "Make " + make + " model " + model + " year " + year;
    }
} 

