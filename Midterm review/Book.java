
public class Book extends LibaryItems{

    private String author;

    public Book(String title, String author)
    {
        super(title);
        this.author = author;
    }

    public void displayInfo()
    {
        System.out.println("Title " + title + " author " + author);
    }
   
}
    
