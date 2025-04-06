import java.util.*;
public class BookSortMain
{   
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       BookSort[] books = new BookSort[5];
       int numPages = 0;
       for(int i = 0; i < books.length; i++)
       {
        System.out.println("Enter title ");
        String title = scan.nextLine();
        System.out.println("Enter number of pages ");
        numPages = scan.nextInt();
        scan.nextLine();
        books[i] = new BookSort(title, numPages);
       }

       System.out.println("Sorting Array by title ");
       Arrays.sort(books);
       System.out.print("Printing sorted Array ");
       int comma = 0;
       for(int i = 0; i < books.length; i++)
       {
            System.out.print(books[i]);
            if(comma < books.length - 1)
            {
                System.out.print(", ");
                comma++;
            }
       }
       System.out.println();

       System.out.println("Enter the title of the book you want to find ");
       String title = scan.nextLine();

       int search = Arrays.binarySearch(books, new BookSort(title, numPages));
       
       if(search >= 0)
       {
        System.out.println("Book is at index " + search);
       }else{
        System.out.println("Book not found");
       }

       
   }
} 

