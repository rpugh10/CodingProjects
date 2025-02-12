import java.io.*;

public class ReadStudent 
{
  public static void main(String[] args) throws IOException, ClassNotFoundException
  {
      

     FileInputStream fstream = new FileInputStream("student.dat");
     ObjectInputStream inputFile = new ObjectInputStream(fstream);

    try {
        while(true)
        {
          Student student = (Student) inputFile.readObject();
          student.display();
        }
    } catch (EOFException e) {
    }

     inputFile.close();

     

    
  } 

}