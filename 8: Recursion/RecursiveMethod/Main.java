/*
Reverses a sentence ending with ".".
*/
import java.util.Scanner;

public class Main {
    public static Scanner input;

    public static void main(String args[]) {
        input = new Scanner(System.in);
        reverseSentence();
    }

    public static void reverseSentence() {
        String str = input.nextLine();
        if (!str.equals(".")) {
            reverseSentence();
        }
        System.out.println(str);
    }
}
