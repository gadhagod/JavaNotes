public class Teacher
{
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getFullName() {
        return "Mr/Ms. " + name;
    }
}
