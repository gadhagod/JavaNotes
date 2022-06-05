/*
Solely dividing two integers results in a truncated integer result. To accurately divide
integers, cast at least one of the integers to a double. The result returned will be a 
double as the other dividends will be promoted to a double.

INCORRECT METHOD: 1 / 2 RETURNS 0
CORRECT METHOD: 1 / (double) 2 RETURNS 0.5
*/
import java.util.Scanner;

public class IntDivision {
    public static void main(String[] args) {
        // dividing two numbers
        Scanner input = new Scanner(System.in);
        System.out.print("First int: ");
        int num1 = input.nextInt();
        System.out.print("Second int: ");
        int num2 = input.nextInt();
        
        double result = (double) num1 / num2; // convert either of the numbers to a double, to have the result be a double

        System.out.println(result);
    }
}