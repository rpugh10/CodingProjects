


public abstract class Vehicle implements Comparable<Vehicle>
{
    private String brand;
    private double maxSpeed;

    public Vehicle(String brand, double maxSpeed)
    {
      this.brand = brand;
      this. maxSpeed = maxSpeed;
    }

    public String toString()
    {
      return "Brand " + brand + " max speed " + maxSpeed + "km/h";
    }

    public double getMaxSpeed()
    {
      return maxSpeed;
    }

    public abstract void honk();

    public int compareTo(Vehicle name)
    {
      if(this.maxSpeed < name.getMaxSpeed())
      {
        return -1;
      }
      else if(this.maxSpeed > name.getMaxSpeed())
      {
        return 1;
      }
      else 
      return 0;
    }
}



 
