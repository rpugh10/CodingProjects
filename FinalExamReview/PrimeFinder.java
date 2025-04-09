

public class PrimeFinder implements Runnable
{
   private int start, end;
   private static int[] data;
   private static int size;
   private int id;

   public PrimeFinder(int id)
   {
      this.id = id;
   }

   public static int[] arrayBuilder(int size)
   {
      data = new int[size];
      for(int i = 0; i < size; i++)
      {
         data[i] = i;
      }
      return data;
   }

   public int[] primeChecker(int start, int end)
   {
      for(int i = start; i < end; i++)
      {
         if(!isPrime(data[i]))
         {
           data[i] = 0;
         }
      }
      return data;
   }

   public static boolean isPrime(int n)
   {
      if(n < 2){
      return false;
      }
      for(int i = 2; i <= Math.sqrt(n); i++)
      {
         if(n % i == 0)
         {
            return false;
         }
      }
      return true;
   }

   public void run()
   {
      switch (id)
      {
         case 1: 
         primeChecker(0, data.length / 4);
         break;

         case 2: 
         primeChecker(data.length / 4, data.length / 2);
         break;

         case 3:
         primeChecker(data.length / 2, (3 * data.length) / 4);
         break;

         case 4:
         primeChecker((3 * data.length) / 4, data.length);
         break;
      }
   }


   public static void main(String[] args) {
       size = 1000;
       data = arrayBuilder(size);

       for(int i = 1; i < 5; i++)
       {
         Thread childThread = new Thread(new PrimeFinder(i));
         childThread.start();

         try {
             childThread.join();
         } catch (InterruptedException e) {
         }
       }
       
       System.out.println("Prime Numbers ");
       for(int i = 0; i < data.length; i++)
       {
         if(data[i] != 0){
         System.out.print(data[i] + ", ");
         }

       }
       System.out.println();
   }

   
}
    
