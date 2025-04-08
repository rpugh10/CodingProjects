
public class SearchThread implements Runnable{
  private static int[] data;
  private static int size;
  private static int targetNumber;
  private int start, end;
  private int result = - 1;

  public SearchThread(int start, int end)
  {
    this.start = start;
    this.end = end;
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

  public static int linearSearch(int start, int end)
  {
    for(int i = start; i < end; i++)
    {
        if(data[i] == targetNumber)
        {
            return i;
        }
    }
    return -1;
  }

  public void run()
  {
      result = linearSearch(start, end);
  }

  public int getResult()
  {
      return result;
  }

  public static void main(String[] args) {
    size = 10;
    data = buildArray(size);
    targetNumber = 5;
    int mid = data.length / 2;

    SearchThread searchTask = new SearchThread(0, mid);
    Thread thread = new Thread(searchTask);
    thread.start();

    int mainThread = linearSearch(mid, data.length);

    try {
        thread.join();
    } catch (InterruptedException e) {
        System.out.println("Child thread was interrupted: " + e.getMessage());
    }


    int foundIndex = -1;
    if(searchTask.getResult() != -1)
    {
        foundIndex = searchTask.getResult();
        System.out.println("Target " + targetNumber + " found by child thread");
    }else if(mainThread != -1)
    {
        foundIndex = mainThread;
        System.out.println("Target " + targetNumber + " found by main thread");
    }else{
        System.out.println("Target " + targetNumber + " was not found in either thread");
    }

   int comma = 0;
   System.out.print("Printing Array ");
   for(int i = 0; i < size; i++)
   {
        System.out.print(data[i]);
        if(comma < size - 1)
        {
            comma++;
            System.out.print(", ");
        }

   }
  }

}

