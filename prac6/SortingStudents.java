package prac6;

import java.util.Comparator;

public class SortingStudents implements Comparator<Student>
{

    @Override
    public int compare(Student student1, Student student2)
    {
        return Double.compare(student2.getGPA(), student1.getGPA());
    }
}