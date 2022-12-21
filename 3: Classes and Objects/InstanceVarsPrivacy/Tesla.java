/*
 * Private instance fields are private to a class, not object. 
 * This means you can directly access private instance fields 
 * from other objects of the same class without mutators or accessors.
 */
public class Tesla 
{
    private String model;

    public Tesla(String model)
    {
        this.model = model;
    }

    public void printModels(Tesla other) {
        System.out.println(model);
        System.out.println(other.model); // direct access to private instance field
    }

    public static void main(String[] args) 
    {
        Tesla a = new Tesla("S");
        Tesla b = new Tesla("X");
        a.printModels(b);
    }
}
