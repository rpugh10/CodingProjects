public class Car extends Vehicle
{
    public Car(String brand, double maxSpeed)
    {
        super(brand, maxSpeed);
    }
    
    public void honk()
    {
        System.out.println("The car goes Honk Honk");
    }
}

