/*
When a variable of a superclass's type is created with its value of a 
subclass, functions of the variable refer to the overriden definition.

NOTE:
    Suppose method `greet` is not in Super, but rather just Sub. `x.greet()` would
    result in an error because the variable's type is set to Super. Since Super
    does not define `greet` and the variable's type is `Super`.  (p147)

> In Java, the selection of the correct method occurs during the run of the program.
> The compiler determines if a method can be called (is it legal?), while the run-time
  enviroment determines how it will be called (which overriden form should be used?).
*/
public class Main 
{
    public static void main(String[] args) 
    {
        Super x = new Sub();
        x.greet(); // should refer to Sub's `greet`, not Super's

        // the following line won't work, because farewell is not in the Super class
        // x.farewell();
    }
}
