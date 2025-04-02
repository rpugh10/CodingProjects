import java.util.*;
public class MainCompare {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("How many employee objects do you want to add ");
       int numObject = scan.nextInt();
       scan.nextLine();

       EmployeeCompare[] em = new EmployeeCompare[numObject];

       for(int i = 0; i < em.length; i++)
       {
            System.out.println("Enter employee name ");
            String name = scan.nextLine();
            System.out.println("Enter employee ID");
            int id = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter employee salary ");
            double salary = scan.nextDouble();
            scan.nextLine();
            em[i] = new EmployeeCompare(name, id, salary);
       }

       System.out.println("Enter employee index to compare Salary ");
       int id1 = scan.nextInt();
       scan.nextLine();
       int id2 = scan.nextInt();
       scan.nextLine();

       int compare = em[id1].compareTo(em[id2]);
       if(compare == 1)
       {
            System.out.println(em[id1].getName() + " has a higher salary");
       }else if(compare == -1)
       {
            System.out.println(em[id2].getName() + " had a higher salary");
       }
       else{
        System.out.println("Both " + em[id1].getName() + " and " + em[id2].getName() + " have the same salary");
       }




       System.out.println("Printing array before sorting ");
       EmployeeCompare.printArray(em);

       Arrays.sort(em);

       System.out.println("Printing array after sorting ");
       EmployeeCompare.printArray(em);

       System.out.println("Enter employee id to find employee ");
       int id = scan.nextInt();
       scan.nextLine();

       EmployeeCompare.linearSearch(em, id);
       
   }
}

