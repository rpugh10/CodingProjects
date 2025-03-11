import java.util.*;
public class StackMultiMain{
  
    public static void main(String[] args) {
        Stack<LibaryItems> list  = new Stack<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("How many objects do you want to store ");
        int num = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < num; i++)
        {
            System.out.println("Enter book, magazine or dvd ");
            String input = scan.nextLine();

            if(input.equalsIgnoreCase("book"))
            {
                System.out.println("Enter title ");
                String title = scan.nextLine();
                System.out.println("Enter Author ");
                String author = scan.nextLine();
                list.push(new Book(title, author));
            }
            else if(input.equalsIgnoreCase("magazine"))
            {
                System.out.println("Enter title ");
                String title = scan.nextLine();
                System.out.println("Enter issue number ");
                int issueNum = scan.nextInt();
                scan.nextLine();
                list.push(new Magazine(title, issueNum));
            }
            else if(input.equalsIgnoreCase("dvd"))
            {
                System.out.println("Enter title ");
                String title = scan.nextLine();
                System.out.println("Enter duration ");
                int duration = scan.nextInt();
                scan.nextLine();
                list.push(new DVD(title, duration));
            }
            else 
            System.out.println("Invalid input");
        }

        System.out.println("Displaying details ");

        while(!list.isEmpty())
        {
            
            LibaryItems item = list.pop();
            item.displayInfo();
           
        }
    }
}
