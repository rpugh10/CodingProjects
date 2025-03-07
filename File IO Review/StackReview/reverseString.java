import java.io.*;
import java.util.*;
public class reverseString {

    public static String reverseString(String name)
    {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < name.length(); i++)
        {
            stack.push(name.charAt(i));
        }

        for(int i = 0; i < name.length(); i++)
        {
            System.out.print(stack.pop());
        }
        return name;
    }
    public static void main(String[] args)throws IOException
    {
        String name = "ryan";

        reverseString(name);
    }
}
