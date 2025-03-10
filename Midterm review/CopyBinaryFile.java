import java.io.*;
public class CopyBinaryFile implements Serializable{
   private String name; 
   private int age;

   public CopyBinaryFile(String name, int age)
   {
        this.name = name;
        this.age = age;
   }

   public String getName()
   {
    return name;
   }

   public int getAge()
   {
    return age;
   }

   public String toString()
   {
    return "Name " + name + " age " + age;
   }
}
