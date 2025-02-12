import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class WriteStudent  {
    
  public static void main(String[] args)throws IOException {
      Scanner scan = new Scanner(System.in);
      System.out.println("How many student objects do you want to enter ");
      int value = scan.nextInt();

      Student[] stu = new Student[value];

      FileOutputStream fstream = new FileOutputStream("student.dat");
      ObjectOutputStream outputFile = new ObjectOutputStream(fstream);

      for(int i = 0; i < stu.length; i++)
      {
        System.out.println("Enter student name ");
        String name = scan.next();
        System.out.println("Enter student age ");
        int age = scan.nextInt();
        System.out.println("Enter student gpa ");
        double gpa = scan.nextDouble();
        stu[i] = new Student(name, age, gpa);
        outputFile.writeObject(stu[i]);
      }
      System.out.println("Objects stored in file");

      outputFile.close();
  }
}

