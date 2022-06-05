public class MathTeacher extends Teacher {
    public MathTeacher(String name) 
    {
        super(name);
    }

    public void printName()
    {
        // the following line doesn't work because `name` is a private instance variable in the parent class. 
        // System.out.println(this.name); 

        // To access `name`, use the accessor method
        System.out.println(getName());
    }

}
