import java.io.*;
import java.util.*;
public class MarksInMarksOut 
{
    public static void main(String[] args)throws IOException {

    File file = new File("marks.txt");
    Scanner scan = new Scanner(file);
    PrintWriter pw = new PrintWriter("marksCopy.txt");
    
    while(scan.hasNext())
    {
        int input = scan.nextInt();
        System.out.println("Number " + input);
        pw.println(input);
    }

    pw.close();

}
}
    
