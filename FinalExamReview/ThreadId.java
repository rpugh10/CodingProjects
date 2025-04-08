public class ThreadId implements Runnable
{
    
    private int id;
    private static int[] data;
    private static int size;
     
    public ThreadId(int id)
    {
        this.id = id;
    }
     
    public static int[] buildArray(int size)
    {
        data = new int[size];
        for(int i = 0; i < size; i++)
        {
            data[i] = (int) (Math.random() * 100);
        }
        return data;
    }
     
    public void run()
    {
        switch(id)
        {
            case 1:
            int sum = 0;
                for(int i = 0; i < data.length; i++)
                {
                    sum += data[i];
                }
                System.out.println("Sum of the array is " + sum);
                break;
     
            case 2:
            int num = 0;
                for(int i = 0; i < data.length; i++)
                {
                    num += data[i];
                }
                System.out.println("Average is " + num/data.length);
                break;
     
            case 3:
                int largest = Integer.MIN_VALUE;
                for(int i = 0; i < data.length; i++)
                {
                    if(data[i] > largest)
                    {
                        largest = data[i];
                    }
                }
                System.out.println("Largest number is " + largest);
                break;
     
                case 4:
                int smallest = Integer.MAX_VALUE;
                for(int i = 0; i < data.length; i++)
                {
                    if(data[i] < smallest)
                    {
                        smallest = data[i];
                    }
                }
                System.out.println("Smallest value " + smallest);
                break;
                 
            }
        }
     
        public static void main(String[] args) {
            size = 10;
            data = buildArray(size);
     
            for(int i = 1; i < 5; i++)
            {
                 Thread thread = new Thread(new ThreadId(i));
                 thread.start();

                 try {
                     thread.join();
                 } catch (InterruptedException e) {
                 }
            }

            int comma = 0;
            for(int i= 0; i < data.length; i++)
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

