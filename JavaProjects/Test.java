import java.util.Scanner;
import java.util.Stack;
public class Test{
    
  public static void main(String[] args)
  {
    Stack<Character> reverseString = new Stack<>();
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a sentence ");
    String input= scan.nextLine();

    for(int i = 0; i < input.length(); i++)
    {
        reverseString.push((input.charAt(i)));
    }

    while(!reverseString.isEmpty())
    {
      System.out.print(reverseString.pop());
    }


  }
}

