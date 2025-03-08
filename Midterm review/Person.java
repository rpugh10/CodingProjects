import java.io.*;
public class Person implements Serializable{

    private String name;
    private int age;
    private double netWorth;

    public Person(String name, int age, double netWorth)
    {
        this.name = name; 
        this.age = age;
        this.netWorth = netWorth;
    }

    public String toString()
    {
        return "Name " + name + " age " + age + " netWorth " + netWorth;
    }
}
    
