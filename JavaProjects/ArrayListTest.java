import java.util.*;
public class ArrayListTest{
  public static void main(String[] args)
  {
    Stack<Integer> stack = new Stack<>();

    stack.add(5);
    stack.add(10);
    stack.add(15);
    stack.add(20);

    System.out.println("Popped " + stack.pop());
    System.out.println("Peek " + stack.peek());
    System.out.println("Is the stack empty? " + stack.isEmpty());
    System.out.println("Stack size: " + stack.size());
  }
}

