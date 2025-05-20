import java.util.*;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
public class App {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.println("1. Add student");
            System.out.println("2. Get all students");
            System.out.println("3. View student by id");
            System.out.println("4. Update student email");
            System.out.println("5. Delete student");
            System.out.println("6. Exit");
            int input = scan.nextInt();
            scan.nextLine();

            if(input == 1)
            {
                System.out.println("Enter first name");
                String fName = scan.nextLine();
                System.out.println("Enter last name");
                String lName = scan.nextLine();
                System.out.println("Enter student email");
                String email = scan.nextLine();
                System.out.println("Enter enrollment date (yyyy-mm-dd)");
                String dateInput = scan.nextLine();
                LocalDate enrollmentDate = null;
                try{
                enrollmentDate = LocalDate.parse(dateInput);
                }catch(DateTimeParseException e)
                {
                    System.out.println("Invalid date format enter (yyyy-mm-dd)");
                }
                Student stu = new Student(fName, lName, email, enrollmentDate);
                
                StudentDAO studentDAO = new StudentDAO();
                try{
                    studentDAO.addStudent(stu);
                }catch(SQLException e)
                {
                    e.printStackTrace();
                }
            }

            if(input == 2)
            {
                StudentDAO studentDAO = new StudentDAO();
                try{
                   System.out.println(studentDAO.getAllStudents());
                }catch(SQLException e)
                {
                    e.printStackTrace();
                }
            }

            if(input == 3)
            {
                System.out.println("Enter student id");
                int id = scan.nextInt();
                scan.nextLine();
                StudentDAO studentDAO = new StudentDAO();
                try{
                    System.out.println(studentDAO.getStudentById(id));
                }catch(SQLException e)
                {
                    e.printStackTrace();
                }
            }

            if(input == 4)
            {
                System.out.println("Enter student id");
                int id = scan.nextInt();
                scan.nextLine();
                System.out.println("Enter new student email");
                String email = scan.nextLine();
                StudentDAO studentDAO = new StudentDAO();
                try{
                    boolean success =studentDAO.updateStudentEmail(id, email);
                    if(success)
                    {
                        System.out.println("Student email updated");
                    }
                    else
                    {
                        System.out.println("No student found with that id");
                    }
                }catch(SQLException e)
                {
                    e.printStackTrace();
                }
            }

            if(input == 5)
            {
                System.out.println("Enter the student id of the student to delete");
                int id = scan.nextInt();
                scan.nextLine();
                StudentDAO studentDAO = new StudentDAO();
                try{
                    boolean success = studentDAO.deleteStudent(id);
                    if(success)
                    {
                        System.out.println("Student deleted");
                    }
                    else
                    {
                        System.out.println("No student found with that id");
                    }
                }catch(SQLException e)
                {
                    e.printStackTrace();
                }
            }

            if(input == 6)
            {
                System.out.println("Exiting");
                break;
            }
        }
        scan.close();
    }
}
