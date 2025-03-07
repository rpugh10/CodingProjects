import java.util.*;
public class Test
{   
    public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    Stack<String> stacks = new Stack<>();
    Scanner scan = new Scanner(System.in);
    int num;
    String value;

    for(int i = 0; i < 5; i++)
    {
        System.out.println("Enter integers ");
        num = scan.nextInt();
        scan.nextLine();
        stack.push(num);
    }

    for(int i =0; i < 5; i++)
    {
        System.out.println("Enter strings ");
        value = scan.nextLine();
        stacks.push(value);
    }

    System.out.println("Pop :" + stack.pop());
    System.out.println("Pop :" + stacks.pop());
    System.out.println("Peek " + stack.peek());
    System.out.println("Peek " + stacks.peek());
    System.out.println("Is empty " + stack.isEmpty());
    System.out.println("Is empty " + stacks.isEmpty());
    System.out.println("Size: " + stack.size());
    System.out.println("Size: " + stacks.size());
    
    }
} 

