import java.io.*;
import java.util.Scanner;
public class TestFriend 
{

  public static void writeFriendsToTextFile(Friend[] friend, String fileName)throws IOException
  {
    PrintWriter pw = new PrintWriter(fileName);
    pw.println(friend.length);
    for(int i = 0; i < friend.length; i++)
    {
      pw.print(friend[i].getName() + " ");
      pw.print(friend[i].getAge() + " ");
      pw.print(friend[i].getGpa() + " " );
      pw.println();
    }
    pw.close();
  }

  public static Friend[] readFriendsFromTextFile(String fileName)throws IOException
  {
    File file = new File(fileName);
    Scanner scan = new Scanner(file);
    int num = scan.nextInt();
    Friend[] friend = new Friend[num];
    for(int i = 0; i < friend.length; i++)
    {
      String name = scan.next();
      int age = scan.nextInt();
      double gpa = scan.nextDouble();
      friend[i] = new Friend(name, age, gpa);
    }
    return friend;
  }

  public static void writeFriendsToBinaryFile(Friend[] friend, String fileName)throws IOException
  {
    FileOutputStream fstream = new FileOutputStream(fileName);
    ObjectOutputStream outputFile = new ObjectOutputStream(fstream);
    outputFile.writeInt(friend.length);
    for(int i = 0; i < friend.length; i++)
    {
      outputFile.writeObject(friend[i]);
    }
    outputFile.close();
  }

  public static Friend[] readFriendsFromBinaryFile(String fileName)throws IOException
  {
    FileInputStream fstream = new FileInputStream(fileName);
    ObjectInputStream inputFile = new ObjectInputStream(fstream);
    Friend[] friend = new Friend[inputFile.readInt()];
    
    for(int i = 0; i < friend.length; i++)
    {
      try{
        friend[i] = (Friend)inputFile.readObject();
      }catch(ClassNotFoundException e)
      {
        System.out.println("Class not found");
      }

    }
    inputFile.close();
    return friend;
  }
  
  
  public static void main(String[] args) throws IOException, ClassNotFoundException
  {
      Friend[] friend = new Friend[5];
      friend[0] = new Friend("Ryan", 21, 3.89);
      friend[1] = new Friend("Mia", 19, 4.0);
      friend[2] = new Friend("Kyle", 19, 4.0);
      friend[3] = new Friend("Josh", 21, 1.5);
      friend[4] = new Friend("Rylan", 21, 1.9);
      for(int i = 0; i < friend.length; i++)
      {
        System.out.println(friend[i]);
      }

      writeFriendsToTextFile(friend, "friend.txt");
      friend = readFriendsFromTextFile("friend.txt");
      for(int i = 0; i < friend.length; i++)
      {
        System.out.println(friend[i]);
      }

      writeFriendsToBinaryFile(friend, "friend.dat");
      friend = readFriendsFromBinaryFile("friend.dat");
      for(int i = 0; i < friend.length; i++)
      {
        System.out.println(friend[i]);
      }
  } 

}