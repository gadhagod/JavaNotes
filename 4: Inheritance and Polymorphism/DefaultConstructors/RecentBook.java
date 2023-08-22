public class RecentBook 
{
    private int publicationYear;

    public RecentBook() 
    {
        System.out.println("Parent contructor called!");
        publicationYear = 2022;
    }

    public RecentBook(int publicationYear) 
    {
        this.publicationYear = publicationYear;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}
