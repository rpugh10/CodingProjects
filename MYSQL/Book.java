public class Book {

    private int book_id;
    private String title;
    private String author;
    private int yearPublished;
    private boolean isAvailable;

    public Book(int book_id, String title, String author, int yearPublished, boolean isAvailable)
    {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isAvailable = isAvailable;
    }

    public Book(){
        
    }

    public void setBookID(int book_id)
    {
        this.book_id = book_id;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setYearPublished(int yearPublished)
    {
        this.yearPublished = yearPublished;
    }

    public void setIsAvailable(boolean isAvailable)
    {
        this.isAvailable = isAvailable;
    }

    public int getBookID()
    {
        return book_id;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public int getYearPublished()
    {
        return yearPublished;
    }

    public boolean getIsAvailable()
    {
        return isAvailable;
    }

    public String toString()
    {
        return "Book ID: " + book_id + "\n" + "Title: " + title + "\n" + "Author: " + author + "\n" + "Year Published" + yearPublished + "\n" + "Is Available: " + isAvailable + "\n";
    }
}
