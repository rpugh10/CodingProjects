package jpa.example;
import java.math.BigDecimal;
import java.util.*;

import jpa.example.dao.DepartmentDao;
import jpa.example.dao.EmployeeDao;
import jpa.example.model.Department;
import jpa.example.model.Employee;
public class MainEmployeeDepartment {
    
    public static void Main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        DepartmentDao deptDAO = new DepartmentDao();
        EmployeeDao emDAO = new EmployeeDao();

        while(true)
        {
            System.out.println("1. Enter Departments");
            System.out.println("2. Add employees");
            System.out.println("3. Display all");
            System.out.println("4. Find greater salary");
            System.out.println("5. Update Salary");
            System.out.println("6. Delete Employee");
            System.out.println("7. Exit");
            int input = scan.nextInt();
            scan.nextLine();

            if(input == 1)
            {
                System.out.println("Enter department name: ");
                String name = scan.nextLine();
                Department department = new Department(name);
                deptDAO.save(department);
            }
            else if(input == 2)
            {
                System.out.println("Enter first name: ");
                String fName = scan.nextLine();
                System.out.println("Enter last name: ");
                String lName = scan.nextLine();
                System.out.println("Enter salary: ");
                BigDecimal salary = scan.nextBigDecimal();
                scan.nextLine();
                Employee em = new Employee(fName, lName, salary);
                emDAO.save(em);
            }
            else if(input == 3)
            {
                System.out.println("Enter department to display: ");
                String name = scan.nextLine();
                Department fetched = deptDAO.findByName(name);

                if(fetched != null)
                {
                    System.out.println("Employees in department " + name);
                    for(Employee e: fetched.getEmployees()){
                        System.out.println(e.getFName() + " " +  e.getLName() + "\n");
                    }
                }
                else{
                    System.out.println("Department not found");
                }
                
            }
        }
    }
}
