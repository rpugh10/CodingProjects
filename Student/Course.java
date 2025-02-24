
public class Course
{
    protected String courseName;
    protected int courseCode;

    public Course(String courseName, int courseCode)
    {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public int getCourseCode()
    {
        return courseCode;
    }
}