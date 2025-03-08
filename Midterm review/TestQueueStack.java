import java.util.Scanner;
public class TestQueueStack{
 
    public static void main(String[] args) {
        ArrayListStack<Integer> stack = new ArrayListStack<>();
        ArrayListQueue<Integer> queue = new ArrayListQueue<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("How many integers do you want to add ");
        int num = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < num; i++)
        {
            System.out.println("Enter an integer ");
            int value  = scan.nextInt();
            scan.nextLine();
            stack.add(value);
            queue.add(value);
        }

        System.out.println("Popping numbers ");
        for(int i = 0; i < num; i++)
        {
            System.out.println("Popping stack " + stack.pop());
        }
        for(int i = 0; i < num; i++)
        {
            System.out.println("Popping queue " + queue.pop());
        }
    }
}

