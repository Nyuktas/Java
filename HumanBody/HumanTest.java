class Head
{
    private String eyeColor;

    public Head(String eyeColor)
    {
        this.eyeColor = eyeColor;
    }

    public String getEyeColor()
    {
        return eyeColor;
    }
}

class Leg
{
    private int length;

    public Leg(int length)
    {
        this.length = length;
    }

    public int getLength()
    {
        return length;
    }
}

class Hand
{
    private int fingers;

    public Hand(int fingers)
    {
        this.fingers = fingers;
    }

    public int getFingers()
    {
        return fingers;
    }
}

class Human
{
    private Head head;
    private Leg leg;
    private Hand hand;

    public Human(Head head, Leg leg, Hand hand)
    {
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public Head getHead()
    {
        return head;
    }

    public Leg getLeg()
    {
        return leg;
    }

    public Hand getHand()
    {
        return hand;
    }
}

public class HumanTest
{
    public static void main(String[] args)
    {
        Head head = new Head("Карие");
        Leg leg = new Leg(100);
        Hand hand = new Hand(5);

        Human person = new Human(head, leg, hand);

        System.out.println("Цвет глаз: " + person.getHead().getEyeColor());
        System.out.println("Длина ноги: " + person.getLeg().getLength() + " см");
        System.out.println("Количество пальцев на руке: " + person.getHand().getFingers());
    }
}