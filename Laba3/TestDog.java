package dogges;

public class TestDog
{
    public static void main(String[] args)
    {
        Doberman d1 = new Doberman("Арчи", 4);
        GoldenRetriever gr1 = new GoldenRetriever("Маршалл", 3);

        d1.high();
        gr1.high();
    }
}