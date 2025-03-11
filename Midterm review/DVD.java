public class DVD extends LibaryItems{
   
    private int duration;

    public DVD(String title, int duration)
    {
        super(title);
        this.duration = duration;
    }

    public void displayInfo()
    {
        System.out.println("Title " + title + " duration " + duration);
    }
}
