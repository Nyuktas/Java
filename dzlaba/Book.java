package dzlaba;

public class Book
{
    private String title;
    private int chapters;

    public Book(String t, int c)
    {
        title = t;
        chapters = c;
    }
    public Book(String t)
    {
        title = t;
        chapters = 10;
    }
    public Book()
    {
        title = "The Great Gatsby";
        chapters = 9;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setChapters(int chapters)
    {
        this.chapters = chapters;
    }
    public String getTitle(String title)
    {
        return title;
    }
    public int getChapters()
    {
        return chapters;
    }
    public String toString()
    {
        return this.title+", chapters "+this.chapters;
    }

    public void outTitleAndChapters()
    {
        System.out.println("In '" + title + "' there  are " + chapters + " chapters");
    }
}