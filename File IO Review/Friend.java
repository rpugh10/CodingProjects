
import java.io.Serializable;

public class Friend implements Serializable
{   
   private String name;
   private int age;
   private double gpa;

   public Friend(String name, int age, double gpa)
   {
      this.name = name; 
      this.age = age;
      this.gpa = gpa;
   }

   public String getName()
   {
      return name;
   }

   public int getAge()
   {
      return age;
   }

   public double getGpa()
   {
      return gpa;
   }

   public String toString()
   {
      return " Name " + name + " age " + age + " gpa " + gpa;
   }
} 

