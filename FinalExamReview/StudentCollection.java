public class StudentCollection implements Comparable<StudentCollection>
{
    private String name;
    private double gpa;

    public StudentCollection(String name, double gpa)
    {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return "Student name " + name + " gpa: " + gpa;
    }

    public int compareTo(StudentCollection name)
    {
        String studentName = name.getName();
        if(this.name.compareTo(studentName) > 0)
        {
            return 1;
        }
        else if(this.name.compareTo(studentName) < 0)
        {
            return -1;
        }
        else{
            return 0;
        }
    }
}
