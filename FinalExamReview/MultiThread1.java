public class MultiThread1 implements Runnable
{
    private static int counter = 0;
    private int id;

    public MultiThread1(int id){
        this.id = id;
    }

    public void run()
    {
        for(int i = 0; i < 100; i++)
        {
            counter++;
            System.out.println("Child thread " + id + " is printing out " + counter);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MultiThread1(1));
        Thread thread1 = new Thread(new MultiThread1(2));

        thread.start();
        thread1.start();

        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
        }
    }
}
    
