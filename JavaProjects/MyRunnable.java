
public class MyRunnable implements Runnable
{
    public void run()
    {
        for(int i = 0; i <= 1000; i++)
        {
            System.out.println("Thread 1: " + i);
        }
        System.out.println("Thread 1 is done");
    }

    public static void main(String[] args)throws InterruptedException {
        Thread thread = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());
            
        thread.start();

    }
}