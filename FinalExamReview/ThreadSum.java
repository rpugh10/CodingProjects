public class ThreadSum implements Runnable{
   private static int[] data;
   private static int size;
   private int start, end;
   private static int sum = 0;

   public ThreadSum(int start, int end)
    {
        this.start = start;
        this.end = end;
    }

    public static int getSum(int start, int end)
    {
        for(int i = start; i < end; i++)
        {
            sum += data[i];
        }
        return sum;
    }
    
    public void run()
    {
        getSum(0, data.length / 2);
    }

    public static int[] buildArray(int size)
    {
        data = new int[size];
        for(int i = 0; i < size; i++)
        {
            data[i] = (int) (Math.random() * 10);
        }
        return data;
    }


    public static void main(String[] args) {
        size = 5;
        data = buildArray(size);

        ThreadSum thread = new ThreadSum(0, data.length / 2);
        Thread childThread = new Thread(thread);
        childThread.start();
        int mainThread = getSum(data.length / 2, data.length);
        try {
            childThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sum is " + sum);

        int comma = 0;
        for(int i = 0; i < data.length; i++)
        {
            System.out.print(data[i]);
            if(comma < data.length - 1)
            {
                comma++;
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}



