
public class BinarySearchBook implements Comparable<BinarySearchBook>
{   
    private String book;
    private String author;
    private int yearPublished;

    public BinarySearchBook(String book, String author, int yearPublished)
    {
        this.book = book;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getBook()
    {
        return book;
    }

    public String toString()
    {
        return "Book name " + book + " author " + author + " year published " + yearPublished;
    }

    public int compareTo(BinarySearchBook book)
    {
        String bookTitle = book.getBook();
        if(this.book.compareTo(bookTitle) > 0)
        {
            return 1;
        }
        else if(this.book.compareTo(bookTitle) < 0)
        {
            return - 1;
        }
        else{
            return 0;
        }

    }

    public static int binarySearch(BinarySearchBook[] books, String bookTitle)
    {
        int start = 0;
        int end = books.length - 1;
        while(start <= end)
        {
            int middle = (end - start) / 2;

            if(bookTitle.compareTo(books[middle].getBook()) == 0)
            {
                return middle;
            }
            else if(bookTitle.compareTo(books[middle].getBook()) < 0)
            {
                end = middle - 1;
            }
            else if(bookTitle.compareTo(books[middle].getBook()) > 0)
            {
                start = middle + 1;
            }
        }
        return - 1;
    }
} 

