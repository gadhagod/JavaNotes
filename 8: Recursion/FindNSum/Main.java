import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println(getSum(in.nextInt()));
    }

    public static int sum(int n) 
    {
        if (n == 1)
        {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static int getSum(int n)
    {
        if (n > 0)
        {
            return sum(n);
        } 
        else
        {
            throw new IllegalArgumentException("Hi");
        }
    }
}
