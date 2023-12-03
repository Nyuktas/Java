package Ball;

public class TestAuthor
{
    public static void main(String[] args)
    {
        Author a1 = new Author("Stephen King", "Stephen_E.King@gmail.com", 'M');
        System.out.println(a1);
        System.out.println("Author's name is " + a1.getName());
        System.out.println("Author's email is " + a1.getEmail());
    }
}