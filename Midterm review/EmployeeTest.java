import java.util.*;
public class EmployeeTest{
   
    public static void main(String[] args) {
       ArrayList<Employee> list = new ArrayList<>();
       Scanner scan = new Scanner(System.in);

       System.out.println("How big do you want the arraylist ");
       int num = scan.nextInt();
       scan.nextLine();

       for(int i = 0; i < num; i++)
       {
            System.out.println("Enter employee salary ");
            double salary = scan.nextDouble();
            scan.nextLine();
            System.out.println("Enter employee age ");
            int age = scan.nextInt();
            scan.nextLine();
            list.add(new Employee(salary, age));
       }

       System.out.println("Array before sorting ");
       for(int i = 0; i < num; i++)
       {
            System.out.println(list.get(i));
       }

       Collections.sort(list);

       System.out.println("Array after sorting");

       for(int i = 0; i < num; i++)
       {
        System.out.println(list.get(i));
       }
    }
}
