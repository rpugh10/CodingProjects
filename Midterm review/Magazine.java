public class Magazine extends LibaryItems{
    
    private int issueNumber;

    public Magazine(String title, int issueNumber)
    {
        super(title);
        this.issueNumber = issueNumber;
    }

    public void displayInfo()
    {
        System.out.println("Title " + title + " issue number " + issueNumber);
    }

}

