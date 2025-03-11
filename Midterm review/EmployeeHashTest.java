import java.util.*;
public class EmployeeHashTest {
   
  public static void main(String[] args) {
      HashMap<String, EmployeeHashMap> employee = new HashMap<>();
      Scanner scan = new Scanner(System.in);
      System.out.println("How many employees do you want to enter ");
      int numEmployee = scan.nextInt();
      scan.nextLine();

      for(int i = 0; i < numEmployee; i++)
      {
        System.out.println("Enter employee name ");
        String name = scan.nextLine();
        System.out.println("Enter employee salary ");
        double salary = scan.nextDouble();
        scan.nextLine();
        EmployeeHashMap em = new EmployeeHashMap(name, salary);
        employee.put(name, em);
      }
      System.out.println("Enter employee name to increase salary ");
      String name = scan.nextLine();
      for(String i: employee.keySet())
      {
        if(name.equalsIgnoreCase(i))
        {
            System.out.println("Enter a percentage to increase salary");
            double percent = scan.nextDouble();
            scan.nextLine();

            EmployeeHashMap emp = employee.get(name);
            emp.increaseSalary(percent);

            System.out.println("After ");
            emp.displayInfo();
        }
    }
    }

    
}

