import java.util.*;
public class ArrayListQueues<T>
{
    ArrayList<T> list;

    public ArrayListQueues()
    {
        list = new ArrayList<>();
    }

    public void enqueue(T element)
    {
        list.add(element);
    }

    public T pop()
    {
        return list.remove(0);
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    public int size()
    {
        return list.size();
    }



}
    
