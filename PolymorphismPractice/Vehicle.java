
public abstract class Vehicle
{
    protected String model;
    protected int year;

    public Vehicle(String model, int year)
    {
        this.model = model;
        this.year = year;
    }

    public abstract void move();

    public void displayInfo()
    {
        System.out.println("The model is " + model + " the year is " + year);
    }
}