package dzlaba;

public class TestBook
{
    public static void main(String[] args)
    {
        Book b1 = new Book("The Lord of the Rings", 12);
        Book b2 = new Book("Bleach", 686);
        Book b3 = new Book("Alice's Adventures in Wonderland");
        b3.setChapters(12);
        System.out.println(b1);
        b1.outTitleAndChapters();
        b2.outTitleAndChapters();
        b3.outTitleAndChapters();
    }
}