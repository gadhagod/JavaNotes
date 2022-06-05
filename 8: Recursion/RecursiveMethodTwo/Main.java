/*
Prints a isoceles right triangle with a given base length
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printTriangleRows(input.nextInt());
    }

    public static void printTriangleRows(int numStarsInRow) {
        for (int i = 0; i < numStarsInRow; i++) {
            System.out.print("*");
        }
        System.out.println();
        if (numStarsInRow == 1) { // base case
            System.out.println("There it is!");
        } else {
            printTriangleRows(numStarsInRow - 1);
        }
    }
}
