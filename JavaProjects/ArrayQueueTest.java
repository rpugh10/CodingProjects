import java.util.*;
public class ArrayQueueTest
{   
   public static boolean isPalindrome(String input)
   {
      ArrayListQueues<Character> list = new ArrayListQueues<>();

      for(int i = 0; i < input.length(); i++)
      {
         try {
             list.enqueue(input.charAt(i));
         } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String out of bounds ");
         }
      }

      for(int i = input.length() - 1; i >=0; i--)
      {
         try {
             char reversedCharacter = list.pop();
             if(reversedCharacter != input.charAt(i))
             {
             return false;
             }
         } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String out of bounds");
         }
      }
      return true;
   }

   public static int sumOfIntegers(ArrayListQueues<Integer> num)
   {
      int sum = 0;
      while(!num.isEmpty())
      {
         sum += num.pop();
      }
      return sum;
   }

   

   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Do you want to run this program ");
      String input = scan.nextLine();

      while(input.equalsIgnoreCase("Yes"))
      {
         System.out.println("Enter a potential palindrome");
         String value = scan.nextLine();
         System.out.println("Is palindrome " + isPalindrome(value));
         System.out.println("Do you want to try another string ");
         input = scan.nextLine();
      }

      System.out.println("How many numbers do you want to enter ");
      int num = scan.nextInt();
      scan.nextLine();
      ArrayListQueues<Integer> list = new ArrayListQueues<>();
      for(int i = 0; i < num; i++)
      {
         System.out.println("Enter Numbers: ");
         int sum = scan.nextInt();
         scan.nextLine();
         list.enqueue(sum);
      }
      System.out.println("Sum of numbers " + sumOfIntegers(list));

      
   }
} 

