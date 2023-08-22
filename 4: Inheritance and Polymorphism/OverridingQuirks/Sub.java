public class Sub extends Super {

    public void a() 
    {
        System.out.println("Sub's A");
        System.out.println("Calling Sub's C:");
        c();
        System.out.println("Calling Super's A:");
        super.a();
    }

    @Override
    public void c()
    {
        System.out.println("Sub's C");
    }
}
