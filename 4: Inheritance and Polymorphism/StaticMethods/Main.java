public class Main 
{
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m);
    }

    public String toString()
    {
        return "1 + 1 = " + Main.onePlusOne();
    }

    private static String onePlusOne()
    {
        return "2";
    }
}
