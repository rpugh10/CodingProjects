import java.util.*;
public class HashMapStudent{
    private String name;
    HashMap<String,Double> grades;

    public HashMapStudent(String name)
    {
        this.name = name;
        grades = new HashMap<>();
    }

    public void addGrade(String subject, double grade)
    {
        grades.put(subject, grade);
    }

    public double getAverageGrade()
    {
        double sum = 0;
        for(String i : grades.keySet())
        {
            sum += grades.get(i);
        }
        return sum / grades.size();
        
    }
}
