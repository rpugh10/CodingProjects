import java.io.*;
import java.util.Scanner;
public class BinaryFileLogger extends TransactionLogger
{
    public void logTransaction()throws IOException
    {
        Scanner scan = new Scanner(System.in);
        FileOutputStream fstream = new FileOutputStream("transactions.dat", true);
        ObjectOutputStream outputFile = new ObjectOutputStream(fstream);
        System.out.println("How many logs do you want to make ");
        int num = scan.nextInt();
        
        for(int i = 0; i < num; i++)
        {
            System.out.println("Enter order number ");
            int orderNum = scan.nextInt();
            System.out.println("Enter the amount ");
            double amount = scan.nextDouble();
            String result = "Order number " + orderNum + " amount $" + amount;
            outputFile.writeUTF(result);
        }

        outputFile.close();

    }
}
    
