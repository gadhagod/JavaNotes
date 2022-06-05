/*
When doubles are cast to integers, they are truncated, meaning their decimals values are marginalized.

(int) 1.9 RETURNS 1
*/

import java.util.Scanner;

public class DoubleTruncation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Double to truncate:");
        double inp = input.nextDouble();

        int result = (int) inp; // cast the inputted double to int to truncate

        System.out.println(result);
    }    
}
