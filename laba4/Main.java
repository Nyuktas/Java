package laba4;

interface Nameable
{
    String getName();
}

class Planet implements Nameable
{
    private String name;

    public Planet(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }
}

class Car implements Nameable
{
    private String brand;

    public Car(String brand)
    {
        this.brand = brand;
    }

    @Override
    public String getName()
    {
        return brand;
    }
}

class Animal implements Nameable
{
    private String variety;

    public Animal(String variety)
    {
        this.variety = variety;
    }

    @Override
    public String getName()
    {
        return variety;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Planet earth = new Planet("Earth");
        Car bmw = new Car("BMW");
        Animal cat = new Animal("Cat");

        System.out.println("Planet name - " + earth.getName());
        System.out.println("Car brand - " + bmw.getName());
        System.out.println("Animal variety - " + cat.getName());
    }
}