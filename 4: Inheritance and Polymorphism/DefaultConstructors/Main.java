/* 
If no constructor is written for a subclass, the superclass's default constructor
(constructor with no parameters) is used. 

NOTES:
* If the superclass does not possess a default constructor, an error will occur.
*/
public class Main 
{
    public static void main(String args[]) 
    {
        RecentFantasyBook x = new RecentFantasyBook();
        System.out.println(x.getPublicationYear());
    }
}
