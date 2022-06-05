/*
Since arrays are objects, passing them into a function and modifying them
in the function modifies the array everywhere. No copy of the array is
made. Refer to "3: Classes and Objects/ObjectAsParameter".
*/
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 9, 2, 4, 9};
        replaceEvensWithZeroes(arr);
        System.out.println(Arrays.toString(arr)); // should be modified
    }
    private static void replaceEvensWithZeroes(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                arr[i] = 0;
            }
        }
    }
}
