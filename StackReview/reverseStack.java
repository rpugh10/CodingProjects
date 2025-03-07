import java.io.*;
import java.util.*;
public class reverseStack {

    public static <T> Stack<T> reverseStack(Stack<T> stack)
    {
        Stack<T> reversedStack = new Stack<>();

        while(!stack.isEmpty())
        {
            System.out.print(reversedStack.push(stack.pop()) + " ");
        }
        return reversedStack;
    }
    public static void main(String[] args)throws IOException
    {
       Stack<Double> stack = new Stack<>();
       stack.push(1.2);
       stack.push(23.4);
       stack.push(33.4);
       stack.push(54.3);

       reverseStack(stack);
    }
}
