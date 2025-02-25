
import java.util.*;
public class Test{
    
  public static void main(String[] args)
  {
    Stack<Integer> reverseArray = new Stack<>();
    Scanner scan = new Scanner(System.in);

    System.out.println("How big do you want the array ");
    int input = scan.nextInt();

    int[] num = new int[input];

    for(int i = 0; i < num.length; i ++)
    {
      System.out.println("Enter numbers ");
      num[i] = scan.nextInt();
    }

    for(int i = 0; i < num.length; i++)
    {
      reverseArray.push(num[i]);
    }

    System.out.println(reverseArray);

    for(int i = 0; i < num.length; i++)
    {
      System.out.print(reverseArray.pop());
    }
  }
}

