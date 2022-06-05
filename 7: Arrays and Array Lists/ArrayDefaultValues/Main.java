/*
Initializing an array of 
- ints results in an array of 0s
- doubles results in an array of 0.0s
- booleans results in an array of falses
- objects results in an array of nulls
*/
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] x = new int[10];
        double[] y = new double[10];
        boolean[] z = new boolean[10];
        String[] a = new String[10];
        Object[] b = new Object[10];

        System.out.println(Arrays.toString(x)); // array of 0s
        System.out.println(Arrays.toString(y)); // array of 0.0s
        System.out.println(Arrays.toString(z)); // array of falses
        System.out.println(Arrays.toString(a)); // array of nulls
        System.out.println(Arrays.toString(b)); // array of nulls
    }
}
