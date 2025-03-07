import java.io.*;
import java.util.*;
public class VehicleMain {
    
    public static void writeVehiclesToFile(Vehicle[] vehicles, String name)throws IOException
    {
        ObjectOutputStream outputFile = new ObjectOutputStream(new FileOutputStream(name));
        outputFile.writeInt(vehicles.length);
        for(int i = 0; i < vehicles.length; i++)
        {
            outputFile.writeObject(vehicles[i]);
        }
        outputFile.close();
    }

    public static Vehicle[] readVehiclesFromFile(String name)throws IOException
    {
        ObjectInputStream inputFile = new ObjectInputStream(new FileInputStream(name));
        Vehicle[] vehicles = new Vehicle[inputFile.readInt()];
        for(int i = 0; i < vehicles.length; i++)
        {
            try {
                vehicles[i] = (Vehicle)inputFile.readObject();
            } catch (ClassNotFoundException e) {
                System.out.println("Class not found");
            }
        }
        inputFile.close();
        return vehicles;
    }

    public static void main(String[] args)throws IOException
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many car or truck objects do you want to store ");
        int numObj = scan.nextInt();
        scan.nextLine();
        Vehicle[] vehicles = new Vehicle[numObj];

        for(int i = 0; i< vehicles.length; i++)
        {
            System.out.println("Do you want to store a car or a truck ");
            String input = scan.nextLine();
            if(input.equalsIgnoreCase("Truck"))
            {
                System.out.println("Enter the make ");
                String make = scan.nextLine();
                System.out.println("Enter the model ");
                String model = scan.nextLine();
                System.out.println("Enter the year ");
                int year = scan.nextInt();
                scan.nextLine();
                System.out.println("Enter the load capacity ");
                double loadCap = scan.nextDouble();
                scan.nextLine();
                vehicles[i] = new Truck(make, model, year, loadCap);
            }else if(input.equalsIgnoreCase("Car"))
            {
                System.out.println("Enter the make ");
                String make = scan.nextLine();
                System.out.println("Enter the model ");
                String model = scan.nextLine();
                System.out.println("Enter the year ");
                int year = scan.nextInt();
                scan.nextLine();
                System.out.println("Enter the number of doors ");
                int numDoors = scan.nextInt();
                scan.nextLine();
                vehicles[i] = new Car(make, model, year, numDoors);
            }else 
            System.out.println("Invalid input ");
        }

            System.out.println("Writing objects to binary file ");
            writeVehiclesToFile(vehicles, "vehicles.dat");
            System.out.println("Reading objects from binary file ");
            vehicles = readVehiclesFromFile("vehicles.dat");

            System.out.println("Printing objects ");
            for(int i = 0; i < vehicles.length; i++)
            {
                System.out.println(vehicles[i].getDetails());
            }
        
    }
}
