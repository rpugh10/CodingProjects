import java.util.*;
public class FinalPractice 
{
    public static <T extends Comparable<T>> boolean linearSearch(T[] array, T target)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i].compareTo(target) == 0)
            {
                return true;
            }
        }
        return false;
    }

    public static <T extends Comparable<T>> int linearSearch1(ArrayList<T> list, T target)
    {
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).compareTo(target) == 0)
            {
                return i;
            }
        }
        return -1;
    }

    public static <T> boolean linearSearch2(T[] data, int min, int max, T target)
    {
        for(int i = min; i <= max; i++)
        {
            if(data[i].equals(target))
            {
                return true;
            }
        }
        return false;
    }

    public static <T extends Comparable<T>> int binarySearch(T[] array, T target)
    {
        int start = 0;
        int end = array.length - 1;

        while(start <= end)
        {
            int middle = start + (end - start) / 2;
            if(array[middle].compareTo(target) == 0)
            {
                return middle;
            }
            else if(array[middle].compareTo(target) < 0)
            {
                start = middle + 1;
            }
            else 
            end = middle - 1;
        }
        return -1;
    }

    public static <T extends Comparable<T>> int binarySearch1(ArrayList<T> list, T target)
    {
        int start = 0;
        int end = list.size() - 1;
        while(start <= end)
        {
            int middle = start + (end - start) / 2;
            if(list.get(middle).compareTo(target) == 0)
            {
                return middle;
            }else if(list.get(middle).compareTo(target) < 0)
            {
                start = middle + 1;
            }else 
            end = middle - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random gen = new Random();
        int[] num = new int[100];

        for(int i = 0; i < num.length; i++)
        {
            num[i] += gen.nextInt(100) + 1;
        }


        Arrays.sort(num);

        System.out.println("Enter a number to find ");
        int input = scan.nextInt();

        System.out.println("Searching for " + input + " it's at index " + Arrays.binarySearch(num, input));
        


    }
}

