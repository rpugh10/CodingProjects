
import java.io.IOException;

public class Test{
    
  public static void main(String[] args)throws IOException {
 
    TransactionLogger[] ts = new TransactionLogger[2];
    ts[0] = new TextFileLogger();
    ts[1] = new BinaryFileLogger();

    System.out.println("Logging transactions to a text file ");
    ts[0].logTransaction();

    System.out.println("Logging transactions to a binary file");
    ts[1].logTransaction();

    System.out.println("Transactions logged successfully");
    
}
}

