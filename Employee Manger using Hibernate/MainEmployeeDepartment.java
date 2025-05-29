package jpa.example;
import java.math.BigDecimal;
import java.util.*;

import jpa.example.dao.DepartmentDao;
import jpa.example.dao.EmployeeDao;
import jpa.example.model.Department;
import jpa.example.model.Employee;
public class MainEmployeeDepartment {
    
    public static void main(String[] args)
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
                System.out.println("Enter department id to put employee in ");
                Long id = scan.nextLong();
                scan.nextLine();
                Department department = deptDAO.findById(id);
                if(department != null)
                {
                    deptDAO.addEmployeeToDepartment(department, em);
                }
                else{
                    System.out.println("Department not found");
                }
            }
            else if(input == 3)
            {
                System.out.println("Enter department id: ");
                Long id = scan.nextLong();
                scan.nextLine();
                Department fetched = deptDAO.findDepartmentWithEmployees(id);

                if(fetched != null)
                {
                    System.out.println("Employees in department " + id);
                    for(Employee e: fetched.getEmployees()){
                        System.out.println(e.getFName() + " " +  e.getLName() + "\n");
                    }
                }
                else{
                    System.out.println("Department not found");
                }
                
            }
            else if(input == 4)
            {
                System.out.println("Enter salary: ");
                BigDecimal salary = scan.nextBigDecimal();
                scan.nextLine();

                List<Employee> em = emDAO.findSalaryGreaterThan(salary);

               if(em.isEmpty())
               {
                    System.out.println("No employees found with a salary greater than " + salary);
               }
               else{
                    System.out.println("Employees with a salary greater than: " + salary);
                    for(Employee e: em)
                    {
                        System.out.println(e.getFName() + " " + e.getLName() + " " + e.getSalary());
                    }
               }
            }

            else if(input == 5)
            {
                System.out.println("Enter employee id to update employee: ");
                Long id = scan.nextLong();
                scan.nextLine();
                Employee em = emDAO.findById(id);
                if(em != null)
                {
                    System.out.println("Enter new first name: ");
                    String fName = scan.nextLine();
                    System.out.println("Enter new last name: ");
                    String lName = scan.nextLine();
                    System.out.println("Enter new salary: ");
                    BigDecimal salary = scan.nextBigDecimal();
                    scan.nextLine();
                    em.setFName(fName);
                    em.setLName(lName);
                    em.setSalary(salary);

                    emDAO.update(em);
                    System.out.println("Employee updated");
                }
                else{
                    System.out.println("Employee not found");
                }
            }
            else if(input == 6)
            {
                System.out.println("Enter employee id to delete employee: ");
                Long id = scan.nextLong();
                scan.nextLine();
                Employee em = emDAO.findById(id);

                if(em != null)
                {
                    emDAO.delete(em);
                    System.out.println("Employee deleted");
                }
                else{
                    System.out.println("Employee not found");
                }
            }
            else{
                System.out.println("Exiting");
                break;
            }
        }
        scan.close();
    }
}
