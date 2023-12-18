package prac6;

public class Student
{
    private String name;
    private int iDNumber;
    private double GPA;

    public Student(String name, int iDNumber, double GPA)
    {
        this.name = name;
        this.iDNumber = iDNumber;
        this.GPA = GPA;
    }

    public String getName()
    {
        return name;
    }

    public int getIDNumber()
    {
        return iDNumber;
    }

    public double getGPA()
    {
        return GPA;
    }

    @Override
    public String toString()
    {
        return "Студент: " +
                "Имя - '" + name + '\'' +
                ", iD номер - " + iDNumber +
                ", итоговые баллы - " + GPA;
    }
}