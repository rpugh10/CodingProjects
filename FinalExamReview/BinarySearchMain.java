import java.util.*;
public class BinarySearchMain {
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("How many books do you want to store ");
            int input = scan.nextInt();
            BinarySearchBook[] items = new BinarySearchBook[input];
            scan.nextLine();

            for(int i = 0; i < input; i++)
            {
                System.out.println("Enter book ");
                String book = scan.nextLine();
                System.out.println("Enter author ");
                String author = scan.nextLine();
                System.out.println("Enter publishing year ");
                int publishedYear = scan.nextInt();
                scan.nextLine();

                items[i] = new BinarySearchBook(book, author, publishedYear);
            }

            System.out.println("What book do you want to look for ");
            String title = scan.nextLine();

            System.out.println("Book found at index " + BinarySearchBook.binarySearch(items, title));
            

            
        }

}
