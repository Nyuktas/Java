package dogges;

abstract class Dog
{
    private String name;
    private int age;

    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public abstract void high();

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
}

class Doberman extends Dog
{
    public Doberman(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void high()
    {
        System.out.println("Рост добермана " + getName() + " 67 см");
    }
}

class GoldenRetriever extends Dog
{
    public GoldenRetriever(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void high()
    {
        System.out.println("Рост золотистого ретривера по имени " + getName() + " 56 см");
    }
}