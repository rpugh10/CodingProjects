import java.util.Scanner;
public class Test{
    
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many animals do you want to create");
    int num = scan.nextInt();
    scan.nextLine();

    Animal[] animal = new Animal[num];

    for(int i = 0; i < animal.length; i++)
    {
      System.out.println("Enter lion eagle or dolphin ");
      String input = scan.nextLine();
      if(input.equalsIgnoreCase("lion"))
      {
        System.out.println("Enter lions name ");
        String name = scan.nextLine();
        animal[i] = new Lion(name);
      }
      else if(input.equalsIgnoreCase("eagle"))
      {
        System.out.println("Enter eagles name ");
        String name = scan.nextLine();
        animal[i] = new Eagle(name);
      }
      else if(input.equalsIgnoreCase("dolphin"))
      {
        System.out.println("Enter the dolphins name ");
        String name = scan.nextLine();
        animal[i] = new Dolphin(name);
      }
      else
      System.out.println("Invalid input");
    }

    for(int i = 0; i < animal.length; i++)
    {
      animal[i].makeSound();

      if(animal[i] instanceof Swimmable)
      {
        ((Swimmable) animal[i]).swim();
      }
    }
  }


}

