
import java.util.ArrayList;

public class ArrayListQueue<T>
{
    private ArrayList<T> queue;
    
    public ArrayListQueue()
    {
        queue = new ArrayList<>();
    }   

    public void enqueue (T item)
    {
        queue.add(item);
    }

    public T dequeue()
    {
        return queue.remove(0);
    }

    public void peek()
    {
        queue.get(0);
    }

    public boolean isEmpty()
    {
        return queue.isEmpty();
    }

    public int size()
    {
        return queue.size();
    }

}
    
