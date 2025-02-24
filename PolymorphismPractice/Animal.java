
public abstract class Animal
{
    protected String name;

    public Animal(String name)
    {
        this.name = name;
    }

    public abstract void makeSound();

    public void displayInfo()
    {
        System.out.println(:"The animals name is " + name);
    }
}