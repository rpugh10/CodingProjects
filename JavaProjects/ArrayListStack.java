
import java.util.*;
public class ArrayListStack<T>
{
  private ArrayList<T> stack = new ArrayList<>();
  
  public void add(T element)
  {
    stack.add(element);
  }

  public T pop()
  {
    return stack.remove(stack.size() - 1);
  }

  public T peek()
  {
    return stack.get(stack.size() -1);
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
    
