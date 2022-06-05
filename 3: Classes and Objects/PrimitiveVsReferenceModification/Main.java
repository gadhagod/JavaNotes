/*
Assigning a variable to another primitive variable assignes the new
variable the the VALUE of the other variable. So, modifying the second
variable does NOT affect the first.

On the other hand, modyfing a new class in the same way modifies both
variables.
*/

public class Main {
    public static void main(String[] args) {
        int x = 3;
        int y = x;
        x += 2;
        // Y and X's values should be different.
        System.out.println(x);
        System.out.println(y); 

        Car a = new Car("honda");
        Car b = a;
        b.setModel("toyota");

        // A's and B's model should be the same ("toyota")
        System.out.println(a.getModel());
        System.out.println(b.getModel());
    }
}
