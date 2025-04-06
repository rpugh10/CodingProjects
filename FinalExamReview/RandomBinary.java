import java.util.*;
public class RandomBinary
{
    public static <T extends Comparable<T>> int binarySearch(T[] array, T element)
    {
        int low = 0;
        int high = array.length - 1;
        while(low <= high)
        {
            int middle = (high + low) / 2;
            if(element.compareTo(array[middle]) == 0)
            {
                return middle;
            }else if (element.compareTo(array[middle]) < 0) {
                high = middle - 1;
            }
            else{
                low = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Integer[] numbers = new Integer[100];
        Random generator = new Random();
        System.out.println("Adding random numbers between 1 and 100 to Array ");
        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = generator.nextInt(99) + 1;
        }
        System.out.println("Sorting random numbers ");
        Arrays.sort(numbers);

        System.out.println("Enter number to find ");
        int value = scan.nextInt();
        scan.nextLine();

        int search = binarySearch(numbers, value);
        if (search != -1) {
            System.out.println("Number found at index: " + search);
        } else {
            System.out.println("Number not found.");
        }

        System.out.println("Printing array ");

        int comma = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i]);
            if(comma < numbers.length - 1)
            {
                System.out.print(", ");
                comma++;
            }
        }
    }
}
    
