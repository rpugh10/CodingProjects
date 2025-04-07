import java.util.*;
public class MergeArrayThread implements Runnable{
  private static int[] data;
  private static int size;

  public void run()
  {
    Arrays.sort(data, data.length / 2, data.length);
  }

  public static int[] buildArray(int size)
  {
    int[] temp = new int[size];
    for(int i = 0; i < temp.length; i++)
    {
        temp[i] = (int)(Math.random() * 1000);
    }
    return temp;
  }

  public static int[] mergeArray()
  {
    int start = 0;
    int end = data.length;
    int values = 0;
    int middle = data.length / 2;
    int[] num = new int[data.length];

    while(values < middle)
    {
        num[values] = data[start];
        values++;
        start++;
    }
    while(values < end)
    {
        num[values] = data[middle];
        values++;
        middle++;
    }
    return num;
  }


  public static void main(String[] args) {
      long startTime, endTime;
      size = 1000000;
      data = buildArray(size);

      startTime = System.currentTimeMillis();
      Arrays.sort(data);
      endTime = System.currentTimeMillis();
      System.out.println("Elapsed time with one thread " + (endTime - startTime));

    data = buildArray(size);
    startTime = System.currentTimeMillis();
    Thread thread = new Thread(new MergeArrayThread());
    thread.start();
    Arrays.sort(data, 0, data.length/2);
    try{
    thread.join();
    }catch(InterruptedException e){
        System.out.println("Interrupted Error");
    }
    endTime = System.currentTimeMillis();
    System.out.println("Elapsed time with two threads " + (endTime - startTime));

  }
}

