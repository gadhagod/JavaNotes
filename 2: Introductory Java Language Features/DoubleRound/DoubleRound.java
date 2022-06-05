/*
Since simply casting a double to an integer results in its truncation, 0.5 needs to be added
to its value.

Rounding a positive double to the nearest integer:
INCORRECT METHOD: 1.8 (int) RETURNS 1
CORRECT METHOD: (int) (1.8 + 0.5) RETURNS 2

However, this does not apply for negative doubles. Doubles with a negative value need to have
been subtracted by 0.5 for rounding.

(int) (-0.7 - 0.5) RETURNS -1

But, if a double is a whole number, a simple type cast can be used.
*/

import java.util.Scanner;

public class DoubleRound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Double to be rounded: ");
        double num = input.nextDouble();
        int result;

        if((double) ((int) num) == num) { // if num is a whole number
            result = (int) (num);
        } else if (num > 0) { // num is positive
            result = (int) (num + 0.5);
        } else { // num is negative
            result = (int) (num - 0.5);
        }
        
        System.out.println(result);
    }  
}
