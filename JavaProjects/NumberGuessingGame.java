import java.util.*;
public class NumberGuessingGame {
  
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 100) + 1;
        Scanner scan = new Scanner(System.in);
        int chances = 5;
        int numGuess;
        int attempts = 0;
        int highScore = 15;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("You have 5 chances to guess the correct number");
        System.out.println();
        
        System.out.println("Please select the difficulty level: ");
        System.out.println("1. Easy (10 chances)");
        System.out.println("2. Medium (5 chances)");
        System.out.println("3. Hard (3 chances)");
        String input = scan.nextLine();

        if(input.equalsIgnoreCase("easy"))
        {
            chances = 10;
            System.out.println("Great! You have selected the " + input + " difficulty level");
        }else if(input.equalsIgnoreCase("medium"))
        {
            chances = 5;
            System.out.println("Great! You have selected the " + input + " difficulty level");
        }else if(input.equalsIgnoreCase("Hard"))
        {
            chances = 3;
            System.out.println("Great! You have selected the " + input + " difficulty level");
        }else{
            System.out.println("Not a valid entry");
        }
        
        System.out.println("Let's start the game!");

        do{
            System.out.println("Enter your guess: ");
            numGuess = scan.nextInt();
            attempts++;
            if(numGuess < randomNum)
            {
                System.out.println("Incorrect! The number is greater than " + numGuess);
                chances--;
            }
            else if(numGuess > randomNum)
            {
                System.out.println("Incorrect! The number is less than " + numGuess);
                chances--;
            }
            else{
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts");
            }
        }while(numGuess != randomNum && chances > 0);

    }
}
