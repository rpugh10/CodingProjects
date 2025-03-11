import java.util.*;
public class TestHashMap{
  
    public static void main(String[] args) {
        HashMap<String, HashMapStudent> student = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("How many students do you want to add ");
        int numStudent = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < numStudent; i++)
        {
            System.out.println("Enter student name ");
            String name = scan.nextLine();
            HashMapStudent students = new HashMapStudent(name);
            System.out.println("How many subjects ");
            int subjects  = scan.nextInt();
            scan.nextLine();
            for(int j = 0; j < subjects; j++)
            {
                System.out.println("Enter subject ");
                String subject = scan.nextLine();
                System.out.println("Enter grade ");
                double grade = scan.nextDouble();
                scan.nextLine();
                students.addGrade(subject, grade);
            }
            student.put(name, students);
        }

        System.out.println("Calculating student average ");
        
        for(String i: student.keySet())
        {
            System.out.println(i + " " + student.get(i).getAverageGrade());
        }

    }
}
