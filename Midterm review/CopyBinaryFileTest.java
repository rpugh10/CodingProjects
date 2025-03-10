import java.io.*;
import java.util.*;
public class CopyBinaryFileTest{

   public static void copyToNewBinaryFile(String old,String newFile)throws IOException
   {
        ObjectInputStream inputFile = new ObjectInputStream(new FileInputStream(old));
        ObjectOutputStream outputFile = new ObjectOutputStream(new FileOutputStream(newFile));
        Object obj;

        while(true)
        {   try{
            obj = inputFile.readObject();
            outputFile.writeObject(obj);
        }catch(EOFException e){
                break;
            }catch(ClassNotFoundException e)   
            {
                break;
            }
        }
        inputFile.close();
        outputFile.close();
   }

   public static void writeObjectToBinaryFile(ArrayList<CopyBinaryFile> list, String name)throws IOException{

    ObjectOutputStream outputFile = new ObjectOutputStream(new FileOutputStream(name));
    for(int i = 0; i < list.size(); i++)
    {
        outputFile.writeObject(list.get(i));
    }
    outputFile.close();
   }

   public static ArrayList<CopyBinaryFile> readObjectFromBinaryFile(String name)throws IOException{
    ObjectInputStream inputFile = new ObjectInputStream(new FileInputStream(name));
    ArrayList<CopyBinaryFile>list = new ArrayList();

    while(true)
    {
        try {
            list.add((CopyBinaryFile)inputFile.readObject());
        } catch (EOFException e) {
            break;
        }catch(ClassNotFoundException e)
        {
            break;
        }
    }
    inputFile.close();
    return list;
   }
 
    public static void main(String[] args)throws IOException
    {
       
       ArrayList<CopyBinaryFile> list = new ArrayList<>();
       list.add(new CopyBinaryFile("Ryan",21));
       list.add(new CopyBinaryFile("Mia", 19));
       list.add(new CopyBinaryFile("Justin", 19));

       System.out.println("Writing to binary file ");
       writeObjectToBinaryFile(list, "objects.dat");
       System.out.println("Reading objects from binary file");
       for(int i = 0; i < list.size(); i ++)
       {
        System.out.println(list.get(i));
       }

       System.out.println("Copying original file");
       copyToNewBinaryFile("objects.dat", "newFile.dat");
       
       
    }
}
    
