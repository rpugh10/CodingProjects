import java.io.*;
import java.util.*;
public class main {
    
    public static void writeFriendsToTextFile(Friend[] friends, String name)throws IOException
    {
        PrintWriter pw = new PrintWriter(name);
        pw.println(friends.length);

        for(int i = 0; i < friends.length; i++)
        {
            pw.print(friends[i].getName() + " ");
            pw.print(friends[i].getAge() + " ");
            pw.print(friends[i].getGpa() + " ");
            pw.println();
        }
        pw.close();
    }

    public static Friend[] readFriendsFromTextFile(String name)throws IOException
    {
        File file = new File(name);
        Scanner scan = new Scanner(file);
        int length = scan.nextInt();
        Friend[] friends = new Friend[length];
        for(int i = 0; i < friends.length; i++)
        {
            String value = scan.next();
            int age = scan.nextInt();
            Double gpa = scan.nextDouble();
            friends[i] = new Friend(value, age, gpa);
        }
        return friends;
    }

    public static void writeFriendsToBinaryFile(Friend[] friends, String name)throws IOException
    {
        ObjectOutputStream outputFile = new ObjectOutputStream(new FileOutputStream(name));
        outputFile.writeInt(friends.length);
        for(int i = 0; i < friends.length; i++)
        {
            outputFile.writeObject(friends[i]);
        }
        outputFile.close();
    }

    public static Friend[] readFriendsFromBinaryFile(String name)throws IOException
    {
        ObjectInputStream inputFile = new ObjectInputStream(new FileInputStream(name));
        int num = inputFile.readInt();
        Friend[] friends = new Friend[num];
        for(int i = 0; i < friends.length; i++)
        {
            try{
            friends[i] = (Friend)inputFile.readObject();
            }catch(ClassNotFoundException e)
            {
                System.out.println("Class not found " );
            }
        }
        inputFile.close();
        return friends;

    }
     public static void main(String[] args)throws IOException
     {
        Friend[] friend = new Friend[5];
        friend[0] = new Friend("Ryan", 21, 3.89);
        friend[1] = new Friend("Mia", 19, 4.0);
        friend[2] = new Friend("Kyle", 19, 3.9);
        friend[3] = new Friend("Rylan", 21, 2.5);
        friend[4] = new Friend("Josh", 21, 1.0);

        for(int i = 0; i < friend.length; i++)
        {
            System.out.println(friend[i]);
        }

        writeFriendsToTextFile(friend, "friends.txt");
        readFriendsFromTextFile("friends.txt");

        for(int i = 0; i < friend.length; i++)
        {
            System.out.println(friend[i]);
        }

        writeFriendsToBinaryFile(friend, "friends.dat");
        friend = readFriendsFromBinaryFile("friends.dat");

        for(int i = 0; i< friend.length; i++)
        {
            System.out.println(friend[i]);
        }
     }
    
}

