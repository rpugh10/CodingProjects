
public class MaxCompareGen implements Comparable<MaxCompareGen>
{   
   private String name;
   private int number;

   public MaxCompareGen(String name, int number)
   {
      this.name = name;
      this.number = number;
   }

   public String getName()
   {
      return name;
   }

   public int getNumber()
   {
      return number;
   }

   public String toString()
   {
      return "Name: " + name + " number: " + number;
   }


   public static <T extends Comparable <T>> T findMax(T[] array)
   {
      if(array == null || array.length == 0)
      return null;


      T max = array[0];
      for(int i =1; i < array.length; i++)
      {
         if(array[i].compareTo(max) > 0)
         max = array[i];
      }
      return max;
   }

   public int compareTo(MaxCompareGen number)
   {
      int value = number.getNumber();
      if(this.number > value)
      {
         return 1;
      }else if(this.number < value)
      {
         return -1;
      }
      else{
         return 0;
      }
   }

   
} 

