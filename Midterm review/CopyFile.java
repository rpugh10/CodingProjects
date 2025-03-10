import java.io.*;
import java.util.*;
public class CopyFile{

    public static void writeToFile(int[] num, String name)throws IOException
    {
        PrintWriter pw = new PrintWriter(name);
        pw.println(num.length);
        for(int i = 0; i < num.length; i++)
        {
            pw.println(num[i]);
        }
        pw.close();
    }

    public static int[] readFromFile(String name)throws IOException
    {
        File file = new File(name);
        Scanner scan = new Scanner(file);
        int[]num = new int[scan.nextInt()];
        for(int i =0; i < num.length; i++)
        {
            num[i] = scan.nextInt();
        }
        return num;
    }

    public static void copyToNewFile(String original, String newFile)throws IOException
    {
        PrintWriter pw = new PrintWriter(newFile);
        File file = new File(original);
        Scanner scan = new Scanner(file);

        while(scan.hasNext())
        {
            int num = scan.nextInt();
            pw.println(num);
        }
        pw.close();
    }
 
    public static void main(String[] args)throws IOException
    {
        int[] num ={1,2,3,4,5,6,7};
        System.out.println("Writing numbers to file ");
        writeToFile(num,"num.txt");
        System.out.println("Reading numbers from file ");
        int[] result = readFromFile("num.txt");
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        System.out.println("Copying File to new File");
        copyToNewFile("num.txt", "newFile.txt");
    }
}
    
