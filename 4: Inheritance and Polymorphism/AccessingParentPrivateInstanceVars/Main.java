/*
You cannot directly access parent class's private instance variables.
You must instead use public accessors from a subclass.
*/

public class Main {
    public static void main(String[] args) 
    {
        MathTeacher x = new MathTeacher("John");

        x.printName();
    }
}
