/*
If you fail to init an instance variable of a class,
the compiler provides resouable default values for
primitives (0 for #s, false for bools)
- page 111

NOTES:
- Static variables work too
- Primitives only
- Must be instance or static variable (not local)
*/
public class Main {
    public static void main(String[] args) {
        ObjectDefaultValues tester = new ObjectDefaultValues();
        tester.printEmptyBool();
        tester.printEmptyInt();
    }
}
