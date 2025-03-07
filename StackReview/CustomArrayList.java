import java.util.*;
public class CustomArrayList<T>{
    ArrayList<T> stack;

    public CustomArrayList()
    {
        stack = new ArrayList<>();
    }
   
    public void push(T element)
    {
        stack.add(element);
    }

    public T pop()
    {
        return stack.remove(stack.size() -1);
    }

    public T peek()
    {
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public int size()
    {
        return stack.size();
    }
}
    
