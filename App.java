public class App {

    public static double factorial(int num)
    {
        if(num == 0)
        {
            return 1;
        }

        return num * factorial(num - 1);
    }

    public static boolean palindrome(String input)
    {
        int left = 0;
        int right = input.length() - 1;

        if(left > right)
        {
            return false;
        }

        return 
    }
    public static void main(String[] args) throws Exception {
        System.out.println(factorial(5));
    }
}
