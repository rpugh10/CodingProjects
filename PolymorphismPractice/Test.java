import java.util.Scanner;
public class Test{
    
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many objects do you want to store ");
    int value = scan.nextInt();
    scan.nextLine();
    Vehicle[] vehicle = new Vehicle[value];

    for(int i = 0; i < vehicle.length; i++)
    {
      System.out.println("Enter car or boat ");
      String input = scan.nextLine();
      if(input.equalsIgnoreCase("Car"))
      {
        System.out.println("Enter model ");
        String model = scan.nextLine();
        System.out.println("Enter year ");
        int year = scan.nextInt();
        scan.nextLine();
        vehicle[i] = new Car(model, year);
      }
      else if(input.equalsIgnoreCase("Boat"))
      {
        System.out.println("Enter model ");
        String model = scan.nextLine();
        System.out.println("Enter year ");
        int year = scan.nextInt();
        scan.nextLine();
        vehicle[i] = new Boat(model, year);
      }
      else
      System.out.println("Invalid input");
    }

    for(int i = 0; i < vehicle.length; i++)
    {
      vehicle[i].move();

      if(vehicle[i] instanceof Fuelable)
      {
        ((Fuelable) vehicle[i]).refuel(50);
      }
    }
  }
}

