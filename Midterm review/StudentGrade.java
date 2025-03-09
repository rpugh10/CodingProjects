import java.util.*;
public class StudentGrade{
    public static void main(String[] args)
    {
        String name; 
        int input, grade;
        HashMap<String, Integer> map = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a command: ");
        System.out.println("1 - Add/update student ");
        System.out.println("2 - remove student ");
        System.out.println("3 - Display all students ");
        System.out.println("4 - Find top student ");
        System.out.println("5 - Exit");
        input = scan.nextInt();
        scan.nextLine();

        while(input != 5)
        {
            if(input == 1)
            {
                System.out.println("Enter student name");
                name = scan.nextLine();
                System.out.println("Enter grade ");
                grade = scan.nextInt();
                scan.nextLine();
                map.put(name, grade);
                System.out.println("Enter a command: ");
                input = scan.nextInt();
                scan.nextLine();
            }
            else if(input == 2)
            {
                System.out.println("Enter student to remove ");
                name = scan.nextLine();
                map.remove(name);
                System.out.println("Enter a command: ");
                input = scan.nextInt();
                scan.nextLine();
            }
            else if(input == 3)
            {
                for(String student : map.keySet())
                {
                    System.out.println("Student name: " + student + " Grade: " + map.get(student));
                }
                System.out.println("Enter a command: ");
                input = scan.nextInt();
                scan.nextLine();
            }
            else if(input == 4)
            {
                int largest = Integer.MIN_VALUE;
                String topStudent = "";
                for(String student: map.keySet())
                {
                    int studentGrade = map.get(student);
                    if(largest < studentGrade){
                        largest = studentGrade;
                        topStudent= student;
                    }
                }
                System.out.println("Top student " + topStudent + " Grade " + largest);
                System.out.println("Enter a command: ");
                input = scan.nextInt();
                scan.nextLine();
                
            }
            else 
            System.out.println("Exiting ");


        }


    }
}
    
