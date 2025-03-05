
public class ThreadCounter implements Runnable
{   
   private static int count = 0;

   
   public void run()
   {
        System.out.println("The child thread is running");
        for(int i = 0; i < 10; i++)
        {
            count++;
            System.out.println("Child thread: " + count);
        }
   }

   public static void main(String[] args)
   {
        Thread thread = new Thread(new ThreadCounter());
        thread.start();
        System.out.println("Main thread is running ");
        for(int i = 0; i < 10; i++)
        {
            count++;
            System.out.println("Main thread: " + count);
        }
   }
} 

