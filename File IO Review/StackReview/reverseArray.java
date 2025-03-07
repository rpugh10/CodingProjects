import java.io.*;
import java.util.*;
public class reverseArray {

    public static int[] reverseArray(int[] value)
    {
        Stack<Integer> stack = new Stack<>();
        int[] reverseArray = new int[value.length];
        for(int i = 0; i < value.length; i++)
        {
            stack.push(value[i]);
        }
        for(int i = 0; i < value.length; i++)
        {
            System.out.print(reverseArray[i] = stack.pop());
        }
        return reverseArray;

    }
    public static void main(String[] args)throws IOException
    {
       int[] value = {2, 3, 4, 5, 6};

       reverseArray(value);
    }
}
