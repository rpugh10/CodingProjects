
public class Student
{
    private String name;
    private int studentID;
    private Course[] course;
    private int[] grades;
    private int courseCount;

    public Student(String name, int studentID)
    {
        this.name = name;
        this.studentID = studentID;
        this.course = new Course[5];
        this.grades = new int[5];
        this.courseCount = 0;
        
    }

    public void enrollCourse(Course c, int grade)
    {
       if(courseCount < 5)
       {
         course[courseCount] = c;
         grades[courseCount] = grade;
         courseCount++;
       }
       else{
        System.out.println("Cannot enroll in more than 5 courses");
       }
    }

    public double calculateAverage()
    {
        double sum = 0;
        for(int i =0; i < courseCount; i++)
        {
            sum += grades[i];
        }
        return sum / courseCount;
    }

    public void displayStudentInfo()
    {
        System.out.println("Student details: ");
        System.out.println("Name: " + name);
        System.out.println("Student ID " + studentID);
        System.out.print("Courses: ");
        for(int i = 0; i < courseCount; i++)
        {
            System.out.print(course[i].getCourseName() + " (" + grades[i] + ") ");
        }
        System.out.println();
        System.out.println("Average grade " + calculateAverage());
    }
}
    
