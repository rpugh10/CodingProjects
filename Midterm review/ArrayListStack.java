import java.util.*;
public class ArrayListStack<T>{
    ArrayList<T> stack;

    public ArrayListStack()
    {
        stack = new ArrayList<>();
    }

    public void add(T element)
    {
        stack.add(element);
    }

    public T pop()
    {
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public int size()
    {
        return stack.size();
    }

    public String toString()
    {
        return "ArrayList Stack " + stack;
    }
    
}
