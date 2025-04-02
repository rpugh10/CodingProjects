import java.util.*;
public class LinearSearch{
  
    public static void linearSearch(int[] num, int result)
    {
        boolean found = false;
        for(int i = 0; i < num.length; i++)
        {
            if(num[i] == result)
            {
                System.out.println("Value found at index " + i);
                found = true;
                break;
            }
        }

        if(!found)
        {
            System.out.println("Number not found");
        }
    }

    public static void printArray(int[] num)
    {
        int distance = 0;
        System.out.print("Printing array ");
        for(int i = 0; i < num.length; i++)
        {
            System.out.print(num[i]);
            if(distance < num.length - 1)
            {
                System.out.print(",");
                distance++;
            }
            
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        String reRun;
        Random generator = new Random();

        do{
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to add to the array ");
        int num = scan.nextInt();
        scan.nextLine();

        int[] numbers = new int[num];

        System.out.println("Adding random numbers between 0 and 100");
        for(int i = 0; i < num; i++)
        {
            numbers[i] = generator.nextInt(99) + 1;
        }

        System.out.println("What number do you want to find ");
        int numToFind = scan.nextInt();
        scan.nextLine();

        linearSearch(numbers, numToFind);

        printArray(numbers);
        
        System.out.println("Do you want to run this program again ");
        reRun = scan.nextLine();

        }while(reRun.equalsIgnoreCase("Yes"));
    }

}
