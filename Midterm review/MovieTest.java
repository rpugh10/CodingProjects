import java.util.*;
public class MovieTest{
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      ArrayList<Movie> list = new ArrayList<>();
      System.out.println("How many movies do you want to add ");
      int num = scan.nextInt();
      scan.nextLine();

      for(int i = 0; i < num; i++)
      {
        System.out.println("Enter movie title ");
        String title = scan.nextLine();
        System.out.println("Enter year ");
        int year = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter rating ");
        double rating = scan.nextDouble();
        scan.nextLine();
        list.add(new Movie(title, year, rating));
      }

      Collections.sort(list);

      for(int i = 0; i < list.size(); i++)
      {
        System.out.println(list.get(i));
      }

    }
}
