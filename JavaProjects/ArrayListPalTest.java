import java.util.*;
public class ArrayListPalTest{

  public static boolean isPalindrome(String input)
  {
    Stack<Character> stack = new Stack<>();

    for(int i = 0; i < input.length(); i++)
    {
      stack.push(input.charAt(i));
    }

    for(int i = 0; i < input.length(); i++)
    {
      char reversedChar = stack.pop();

      if(reversedChar != input.charAt(i))
      return false;
    }
    return true;
  }
  public static void main(String[] args)
  {
    String test = "racecar";

    System.out.println("Is palindrome " + isPalindrome(test));

    String anotherTest = "welcome";

    System.out.println("Is palindrome " + isPalindrome(anotherTest));
  }

}

