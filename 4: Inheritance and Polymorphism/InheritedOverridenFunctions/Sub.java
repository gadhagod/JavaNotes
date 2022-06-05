public class Sub extends Super 
{

    @Override
    public void greet() 
    {
        System.out.println("Sub's definition");
    } // greet is not polymorphic, being overriden in a subclass

    public void farewell()
    {
        System.out.println("Bye!")
    }
}
