import java.io.*;
import java.util.Scanner;
public static void main(String[] args)throws IOException
  {
    String name;
    int age;
    double gpa;
    Scanner scan = new Scanner(System.in);
    PrintWriter pw = new PrintWriter("students.txt");
   

    System.out.println("How many students do you want to enter: ");
    int input = scan.nextInt();
    for(int i = 0; i < input; i++)
    {
      System.out.println("Enter student name ");
      name = scan.next();
      System.out.println("Enter student age ");
      age = scan.nextInt();
      scan.nextLine();
      System.out.println("Enter student gpa ");
      gpa = scan.nextDouble();
      pw.println(name + " " + age + " " + gpa);
    }

    pw.close();
    FileWriter fw = new FileWriter("students.txt", true);
    PrintWriter print = new PrintWriter(fw);
    Scanner scans = new Scanner(System.in);
    String names;
    int ages;
    double gpas;

    System.out.println("How many more items do you want to add ");
    int value = scan.nextInt();
    
    for(int i = 0; i < value; i++)
    {
      System.out.println("Enter student name ");
      names = scan.next();
      System.out.println("Enter student age ");
      age = scan.nextInt();
      System.out.println("Enter student gpa ");
      gpa = scan.nextDouble();

      print.println(names + " " + age + " " + gpa);
    }

    print.close();
  } 
