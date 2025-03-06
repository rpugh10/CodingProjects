import java.io.*;
import java.util.*;
public class FileWriter 
{
    public static void main(String[] args)throws IOException {

    File file = new File("marks.txt");
    Scanner scan = new Scanner(file);
    FileWriter fwrite = new FileWriter("marks.txt", true);
    PrintWriter pw = new PrintWriter(fwrite);
    
    while(scan.hasNext())
    {
        int input = scan.nextInt();
        System.out.println("Number " + input);
        pw.println(input);
    }

    pw.close();

}
}
    
