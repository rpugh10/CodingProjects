public class Dolphin extends Animal implements Swimmable {

    public Dolphin(String name)
    {
        super(name);
    }

    public void makeSound()
    {
        System.out.println("The dolphin clicks");
    }

    public void swim()
    {
        System.out.println("The dolphin is swimming");
    }
    
}
