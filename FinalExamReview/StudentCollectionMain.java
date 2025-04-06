import java.util.*;

public class StudentCollectionMain{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<StudentCollection> student = new ArrayList<>();
        System.out.println("How many students do you want to store");
        int value = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < value; i++)
        {
            System.out.println("Enter name ");
            String name = scan.nextLine();
            System.out.println("Enter gpa ");
            double gpa = scan.nextDouble();
            scan.nextLine();
            student.add(new StudentCollection(name, gpa));
        }
        System.out.println("Sorting ArrayList");
        Collections.sort(student);

        
    
        System.out.print(student);
        
        System.out.println();

        System.out.println("What student do you want to find ");
        String studentName = scan.nextLine();

        int search = Collections.binarySearch(student, new StudentCollection(studentName, 0));

        if(search >= 0)
        {
            System.out.println(studentName + " is at index " + search);
        }
        else{
            System.out.println("Student not found");
        }
    }
}



