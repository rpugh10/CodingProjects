import java.sql.SQLException;
import java.util.*;
public class App{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. View Book By ID");
            System.out.println("4. Mark as checked in/out");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            int input = scan.nextInt();
            scan.nextLine();

            if(input == 1)
            {
                System.out.println("Enter Book ID");
                int bookID = scan.nextInt();
                scan.nextLine();
                System.out.println("Enter title");
                String title = scan.nextLine();
                System.out.println("Enter author");
                String author = scan.nextLine();
                System.out.println("Enter year published");
                int yearPublished = scan.nextInt();
                scan.nextLine();
                System.out.println("Is available (true/false)");
                boolean isAvailable = scan.nextBoolean();
                Book book = new Book(bookID, title, author, yearPublished, isAvailable);
                LibraryDOA libraryDOA = new LibraryDOA();
                try{
                libraryDOA.addBook(book);
                }catch(SQLException e)
                {
                    e.printStackTrace();
                }
                System.out.println("Book added");
            }
            if(input == 2)
            {
                LibraryDOA libraryDOA = new LibraryDOA();
                try{
                    System.out.println(libraryDOA.getAllBooks());
                }catch(SQLException e)
                {
                    e.printStackTrace();
                }
            }
            if(input == 3)
            {
                System.out.println("Enter book id");
                int book_id = scan.nextInt();
                scan.nextLine();
                LibraryDOA libraryDOA = new LibraryDOA();
                try{
                    System.out.println(libraryDOA.getBookByID(book_id));
                }catch(SQLException e)
                {
                    e.printStackTrace();
                }
            }
            if(input == 4)
            {
                System.out.println("Enter book ID: ");
                int bookID = scan.nextInt();
                scan.nextLine();
                System.out.println("Enter if book is available (true/false)");
                boolean isAvailable = scan.nextBoolean();
                LibraryDOA libraryDOA = new LibraryDOA();
                try{
                  boolean success = libraryDOA.updateBookAvailability(bookID, isAvailable);
                  if(success)
                  {
                    System.out.println("Book availability updated");
                  }
                  else{
                    System.out.println("Could not find book with that id");
                  }
                }catch(SQLException e)
                {
                    e.printStackTrace();
                }
            }
            if(input == 5)
            {
                System.out.println("Enter book id to delete ");
                int bookID = scan.nextInt();
                scan.nextLine();

                LibraryDOA libraryDOA = new LibraryDOA();
                try {
                    boolean success = libraryDOA.deleteBook(bookID);
                    if (success) {
                        System.out.println("Book info deleted");
                    } else {
                        System.out.println("Book ID not found");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(input == 6)
            {
                System.out.println("Exiting");
                break;
            }
        }
        scan.close();
    }
}
