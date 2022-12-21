/*
 * In `Super x = new Sub();`, if both Super and Sub have the same
 * method `yeet()`, calls to `yeet` originating from a Super method will
 * call `yeet` in Sub.
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Bird pigeon = new Dove();
        pigeon.act();
    }
}
