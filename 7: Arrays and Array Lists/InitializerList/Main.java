/*
To initialize an array with values, use an initializer list like so:

type[] variableName = {firstValue, secondValue, ...};
*/
import java.util.Arrays;

public class Main 
{
    public static void main(String[] args) 
    {
        int[] x = {1, 5, 10};
        System.out.println(Arrays.toString(x));

        int[] y = new int[3];
        y[0] = 1;
        y[1] = 5;
        y[2] = 10;
        System.out.println(Arrays.toString(y));
    }
}
