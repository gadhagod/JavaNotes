/*
Enhanced for loops are a great way to traverse arrays.

NOTES:
- Do not use an enhanced for loop to remove or replace elements of an array
- To access the length of an array, use `.length`. This is different from Strings, 
  where we use `.length()` (with parentheses)
*/

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15};

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // OR
        for(int j : arr) {
            System.out.println(j);
        }
    }
}
