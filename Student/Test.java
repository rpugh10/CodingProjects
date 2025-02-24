import java.util.Scanner;
public class Test{
    
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many students do you want to create ");
    int value = scan.nextInt();
    scan.nextLine();
    Student[] student = new Student[value];

    for(int i = 0; i < student.length; i++)
    {
      System.out.println("Enter student name ");
      String name = scan.nextLine();
      System.out.println("Enter student id ");
      int studentID = scan.nextInt();
      scan.nextLine();
      student[i] = new Student(name, studentID);
      
      System.out.println("How many courses do you want to enter ");
      int numCourses = scan.nextInt();
      scan.nextLine();

      for(int j = 0; j < numCourses && j < 5; j++)
      {
        System.out.println("Enter course name ");
        String courseName = scan.nextLine();
        System.out.println("Enter course code ");
        int courseCode = scan.nextInt();
        System.out.println("Enter grade for " + courseName);
        int grade = scan.nextInt();
        scan.nextLine();

        Course course = new Course(courseName, courseCode);
        student[i].enrollCourse(course, grade);

      }
    }

    for(int i = 0; i < student.length; i++)
    {
      student[i].displayStudentInfo();
    }
  }


}

