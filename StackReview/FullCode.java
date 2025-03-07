import java.io.*;
import java.util.*;
public class FullCode {

    public static void writeIntToFile(int[] num, String name)throws IOException
    {
        PrintWriter pw = new PrintWriter(name);
        pw.println(num.length);
        for(int i = 0; i < num.length; i ++)
        {
            pw.println(num[i]);
        }
        pw.close();
    }

    public static int[] readIntFromFile(String name)throws IOException
    {
        File file = new File(name);
        Scanner scan = new Scanner(file);
        int num = scan.nextInt();
        int[] value = new int[num];
        for(int i = 0; i < value.length; i++)
        {
            value[i] = scan.nextInt();
            System.out.println(value[i]);
        }
        return value;
    }

    public static ArrayList<Integer> reversedNum(int[] num)
    {
        ArrayList<Integer> reverseNum = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < num.length; i++)
        {
            stack.push(num[i]);
        }

        for(int i = 0; i < num.length; i++)
        {
            reverseNum.add(stack.pop());
        }
        return reverseNum;
    }

    public static void writeReversedNumToFile(ArrayList<Integer> num, String name)throws IOException
    {
        PrintWriter pw = new PrintWriter(name);
        for(int i = 0; i < num.size(); i++)
        {
            pw.println(num.get(i));
        }
        pw.close();
    }

    public static void main(String[] args)throws IOException
    {
        int[] num ={6, 2, 3, 4, 5, 6, 7};
        writeIntToFile(num, "num.txt");
        readIntFromFile("num.txt");
        ArrayList<Integer> reversedNum = new ArrayList<>();
        reversedNum = reversedNum(num);
        writeReversedNumToFile(reversedNum, "reverse.txt");
    }
    
}
