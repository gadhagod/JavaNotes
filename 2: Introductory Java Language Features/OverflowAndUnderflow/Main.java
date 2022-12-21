/*
 * If an integer goes over Integer.MAX_VALUE, it will go to 
 * Integer.MIN_VALUE. If an integer goes under Integer.MIN_VALUE,
 * it will go to Integer.MAX_VALUE
 */
public class Main {
    public static void main(String[] args) 
    {
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE + 1;
        int a = Integer.MIN_VALUE;
        int z = Integer.MIN_VALUE - 1;
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(z);
    }
}
