public class BookSort implements Comparable<BookSort> 
{
     private String title;
     private int numPages;

     public BookSort(String title, int numPages)
     {
        this.title = title;
        this.numPages = numPages;
     }

     public String getTitle()
     {
        return title;
     }

     public String toString()
     {
        return "Title: " + title + " number of pages: " + numPages;
     }

     public int compareTo(BookSort name)
     {
        String title = name.getTitle();
        if(this.title.compareTo(title) > 0)
        {
            return 1;
        }
        else if(this.title.compareTo(title) < 0)
        {
            return -1;
        }
        else 
        {
            return 0;
        }
     }
}
