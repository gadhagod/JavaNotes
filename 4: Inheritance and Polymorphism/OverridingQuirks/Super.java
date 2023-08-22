public class Super {
    public void a() {
        System.out.println("Super's A");
        System.out.println("Calling C:");
        c();  // MUST BE DEFINED IN SUPER CLASS
    }

    public void c()
    {
        System.out.println("Super's C");
    }
}
