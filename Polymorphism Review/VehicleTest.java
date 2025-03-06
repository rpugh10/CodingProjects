import java.util.*;
public class VehicleTest
{
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("How big do you want the array ");
     int num = scan.nextInt();
     scan.nextLine();

     Vehicle[] vehicle = new Vehicle[num];

     for(int i = 0; i < vehicle.length; i++)
     {
        System.out.println("What type of object do you want to store car or bike ");
        String input = scan.nextLine();

        if(input.equalsIgnoreCase("car"))
        {
            System.out.println("Enter brand ");
            String brand = scan.nextLine();
            System.out.println("Enter max speed ");
            double maxSpeed = scan.nextDouble();
            scan.nextLine();
            vehicle[i] = new Car(brand, maxSpeed);
        }
        else if(input.equalsIgnoreCase("bike"))
        {
            System.out.println("Enter brand ");
            String brand = scan.nextLine();
            System.out.println("Enter max speed ");
            double maxSpeed = scan.nextDouble();
            scan.nextLine();
            vehicle[i] = new Bike(brand, maxSpeed);
        }
        else 
        System.out.println("Invalid input");
     }

     System.out.println("Do you want to compare two objects ");
     String value = scan.nextLine();

     while(value.equalsIgnoreCase("yes"))
     {
        System.out.println("Enter two objects to compare ");
        int obj1 = scan.nextInt();
        int obj2 = scan.nextInt();
        System.out.println("Comparing object " + obj1 + " to " + obj2);
        int compare = vehicle[obj1].compareTo(vehicle[obj2]);
        if(compare == -1)
        {
            System.out.println(obj2 + " has a higher max speed");
        }
        else if(compare == 1)
        {
            System.out.println(obj1 + " has a higher max speed");
        }
        else 
        System.out.println("They both have the same max speeds");

        System.out.println("Do you want to compare two more objects ");
        value = scan.nextLine();
     }
    }
}