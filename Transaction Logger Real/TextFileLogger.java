import java.io.*;
import java.util.Scanner;
public class TextFileLogger extends TransactionLogger
{
    public void logTransaction()throws IOException
    {
        Scanner scan = new Scanner(System.in);
        FileWriter fwrite = new FileWriter("transactions.txt", true);
        PrintWriter pw = new PrintWriter(fwrite);
        System.out.println("How many logs do you want to make ");
        int num = scan.nextInt();
        

        for(int i = 0; i < num; i++)
        {
            System.out.println("Enter order number ");
            int orderNum = scan.nextInt();
            System.out.println("Enter amount ");
            double amount = scan.nextDouble();
            String result = "Order number " + orderNum + " amount $" + amount;
            pw.println(result);
        }

        pw.close();

    }
}