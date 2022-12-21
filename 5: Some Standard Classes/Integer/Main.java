/*
 * Adding to Integers automotically unboxes the int values before
 * adding.
 */
public class Main {
    public static void main(String[] args) {
        Integer x = new Integer(5);
        Integer y = new Integer(5);
        Integer a = x + y;
        int b = x + y;
        System.out.println(a.intValue());
        System.out.println(b);
    }
}
