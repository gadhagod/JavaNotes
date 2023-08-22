/*
 * In a superclass, every call to a method must be defined in
 * the superclass. However, if this  method is overriden
 * in a subclass, it's implementation is used.
 * 
 * For example, if you define foo() in the superclass
 * to print "foo" but in the subclass you override
 * foo() to print "poo" calls to foo() from the superclass
 * will print "poo"
 */
public class Main {
    public static void main(String[] args) {
        Super instance = new Sub();
        instance.a();
    }
}
