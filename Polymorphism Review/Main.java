import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pet[] pets = new Pet[5];
        pets[0] = new Dog("Black", 1, 23.4);
        pets[1] = new Dog("white", 2, 32.2);
        pets[2] = new Dog("Yellow", 12, 12.2);
        pets[3] = new Cat("small", 3, 45.4);
        pets[4] = new Cat("Big", 6, 55.5);

        for(int i = 0; i < pets.length; i++)
        {
            System.out.println(pets[i]);
        }

        int compare = ((Dog)pets[0]).compareTo(pets[3]);

        if(compare == -1)
        {
            System.out.println("Small has a higher preference level");
        }
        else if(compare == 1)
        {
            System.out.println("Black has a higher preference level");
        }
        else 
        System.out.println("They both have equal preference ");

    }
}