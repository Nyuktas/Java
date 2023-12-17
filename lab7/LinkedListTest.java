package lab7;

import java.util.LinkedList;

public class LinkedListTest
{

    public static void main(String[] args)
    {
        LinkedList<String> states = new LinkedList<String>();

        states.add("Германия");
        states.add("Франция");
        states.addLast("Великобритания");
        states.addFirst("Испания");
        states.add(1, "Италия");

        System.out.printf("В списке %d элементов\n", states.size());

        for (String state : states)
        {
            System.out.println(state);
        }

        if (states.contains("Германия"))
        {
            System.out.println("Список содержит государство - Германия");
        }

        states.remove("Германия");
        states.removeFirst();
        states.removeLast();

        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        people.remove(1);

        for (Person p : people)
        {
            System.out.println(p.getName());
        }

        Person first = people.getFirst();
        System.out.println("Первый человек: " + first.getName());
    }
}

class Person
{
    private String name;

    public Person(String value)
    {
        name = value;
    }

    String getName()
    {
        return name;
    }
}