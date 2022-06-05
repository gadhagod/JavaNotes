public class TeacherWithPhd extends Teacher 
{
    public TeacherWithPhd(String name) 
    {
        super(name);
    }

    @Override
    public String getFullName() 
    {
        return super.getFullName().replace("Mr/Ms.", "Dr.");
    }
}
