import java.io.*;
public class Car extends Vehicle implements Serializable {
    private int numDoors;

    public Car(String make, String model, int year, int numDoors)
    {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    public String getDetails()
    {
     return super.getDetails() + " number of doors " + numDoors;
    }
    
}

