/*
The while loop is used to run a code block while a certain condition is satisfied.

This code will continue to ask for input until it recieves 'hello'.
*/

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = "";
        while(!word.equals("hello")) {
            System.out.print("Please entry 'hello': ");
            word = input.nextLine();
        }
        System.out.println("Hello to you as well!");
    }
}
