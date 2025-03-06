import java.util.*;
public class VehicleTest2
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

     
     Arrays.sort(vehicle);

     for(int i = 0; i < vehicle.length; i++)
     {
        System.out.print(vehicle[i]);
        vehicle[i].honk();
     }
    }
}