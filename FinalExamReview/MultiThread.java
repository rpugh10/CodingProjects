public class MultiThread implements Runnable
{
    private static int count = 0;
   public void run()
   {
        System.out.println("This code is running in the child thread");
        for(int i = 0; i < 100; i++)
        {
            count++;
            System.out.println("Child thread " + count);
        }
   }

   public static void main(String[] args) {
       MultiThread obj = new MultiThread();
       Thread thread = new Thread(obj);
       thread.start();
       for(int i = 100; i < 200; i++)
       {
            count++;
            System.out.println("Main thread is running " + count);
       }
       try {
           thread.join();
       } catch (InterruptedException e) {
           System.out.println("Thread was interrupted: " + e.getMessage());
       }
   }
}
    
