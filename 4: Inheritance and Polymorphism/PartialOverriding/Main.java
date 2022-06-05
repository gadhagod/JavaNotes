/*
Partial overriding refers to the the usage of the superclass's function
in the subclass's.
*/
public class Main 
{
    public static void main(String[] args)
    {
        TeacherWithPhd t = new TeacherWithPhd("John");
        System.out.println(t.getFullName());
    }    
}
