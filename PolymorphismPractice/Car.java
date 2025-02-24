
public class Car extends Vehicle implements Fuelable
{

    public Car(String model, int year)
    {
        super(model, year);
    }

    public void move()
    {
        System.out.println("The car drives on the road");
    }

    public void refuel(int liters)
    {
        System.out.println("Car refueled with " + liters + " liters");
    }
}