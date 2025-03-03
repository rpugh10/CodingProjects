import java.util.Scanner;
public class TestPatient {

public static void main(String[] args)
{
    Scanner scan = new Scanner(System.in);
    ArrayListQueue<PatientQueue> queue = new ArrayListQueue<>();

    System.out.println("How many patients do u need to enter ");
    int input = scan.nextInt();
    scan.nextLine();

    for(int i = 0; i < input; i++)
    {
        System.out.print("Enter patient name: ");
        String name = scan.nextLine();

        System.out.print("Enter severity level (1-5): ");
        int severity = scan.nextInt();
        scan.nextLine();

        queue.enqueue(new PatientQueue(name, severity));
    }
    
    while (!queue.isEmpty()) {
        System.out.println(queue.dequeue());
    }
}
}

