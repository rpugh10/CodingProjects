package Study;
import java.io.*;
import java.util.Scanner;
public class Main{
    
    
    
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int sum = 0;
       int count =0;
       try{
       do{
        System.out.println("Enter numbers ");
        String num = scan.nextLine();
        sum += Integer.parseInt(num);
        count++;
       }while(count <10);
    }catch(NumberFormatException exception){
        System.out.println("Invalid input enter valid integers");
        
    }

       double average = sum/count;
       System.out.println("Average " + average);
    }
}
