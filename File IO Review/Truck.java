import java.io.*;
public class Truck extends Vehicle implements Serializable
{
    private double loadCapactiy;

    public Truck(String make, String model, int year, double loadCapactiy)
    {
        super(make, model, year);
        this.loadCapactiy = loadCapactiy;
    }

    public String getDetails()
    {
        return super.getDetails() + " load capacity " + loadCapactiy;
    }

}
    
