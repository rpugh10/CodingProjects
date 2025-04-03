import java.util.*;
public class MaxMain {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter array length ");
        int input = scan.nextInt();
        scan.nextLine();
        
        MaxCompareGen[] max = new MaxCompareGen[input];

        for(int i = 0; i < max.length; i++)
        {
            System.out.println("Enter name ");
            String name = scan.nextLine();

            System.out.println("Enter number ");
            int number = scan.nextInt();
            scan.nextLine();

            max[i] = new MaxCompareGen(name, number);
        }

        System.out.println("What indexes do you want to compare ");
        int index1 = scan.nextInt();
        scan.nextLine();
        int index2 = scan.nextInt();
        scan.nextLine();

        System.out.println("Comparing index " + index1 + " to " + index2);
        
        int compare = max[index1].compareTo(max[index2]);

        if(compare == 1)
        {
            System.out.println(max[index1].getName() + " has a bigger number");

        }
        else if(compare == -1)
        {
            System.out.println(max[index2].getName() + " has a bigger number");
        }
        else{
            System.out.println("Both have the same number");
        }

        System.out.println("Finding max number");
        System.out.print(MaxCompareGen.findMax(max));
        
    }

}
