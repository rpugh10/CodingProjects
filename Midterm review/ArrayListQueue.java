import java.util.*;
public class ArrayListQueue<T>
{   
   private ArrayList<T> queue;

   public ArrayListQueue()
   {
     queue = new ArrayList<>();
   }

   public void add(T element)
   {
     queue.add(element);
   }

   public T pop()
   {
     return queue.remove(0);

   }

   public boolean isEmpty()
   {
        return queue.isEmpty();
   }

   public int size()
   {
        return queue.size();
   }

   public String toString()
   {
        return "Array queue " + queue;
   }


} 

