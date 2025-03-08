import java.io.*;
import java.util.*;
public class PersonTest implements Serializable{

    public static void writePersonObjectToFile(ArrayList<Person> list, String name)throws IOException
    {
        ObjectOutputStream outputFile = new ObjectOutputStream(new FileOutputStream(name));
        for(int i = 0; i < list.size(); i++)
        {
            outputFile.writeObject(list.get(i));
        }
        outputFile.close();
    }

    public static ArrayList<Person> readPersonObjectFromFile(String name)throws IOException
    {
    
        ObjectInputStream inputFile = new ObjectInputStream(new FileInputStream(name));
        ArrayList<Person> personList = new ArrayList<>();
        try {
            while (true) {
                personList.add((Person) inputFile.readObject());
            }
        } catch (EOFException e) {
           
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
        inputFile.close();
        return personList;
    
    }
    
    public static void main(String[] args)throws IOException {
        String name;
        int age;
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("Ryan", 21, 123.43));
        list.add(new Person("Josh", 21, 400.65));
        list.add(new Person("Mia", 19, 20.3));

        writePersonObjectToFile(list, "person.dat");
        list = readPersonObjectFromFile("person.dat");

        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list);
        }
    }
}
