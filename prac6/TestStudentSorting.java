package prac6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestStudentSorting
{
    public static void main(String[] args)
    {
        Student[] students =
                {
                new Student("Катерина", 103, 3.8),
                new Student("Валера", 101, 3.5),
                new Student("Олег", 105, 4.0),
                new Student("Иван", 102, 3.3)
        };

        insertionSortByIDNumber(students);

        System.out.println("Студенты, отсортированные по iD номеру:");
        for (Student student : students)
        {
            System.out.println(student);
        }

        List<Student> list1 = Arrays.asList(
                new Student("Давид", 109, 3.2),
                new Student("Елена", 104, 3.9)
        );

        List<Student> list2 = Arrays.asList(
                new Student("Филип", 106, 3.7),
                new Student("Григорий", 107, 3.6)
        );

        List<Student> mergedList = mergeAndSort(list1, list2, new SortingStudents());

        System.out.println("\nОбъединенный и отсортированный список студентов по итоговым баллам:");
        for (Student student : mergedList)
        {
            System.out.println(student);
        }
    }

    private static void insertionSortByIDNumber(Student[] students)
    {
        int n = students.length;
        for (int i = 1; i < n; ++i)
        {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber())
            {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }

    private static List<Student> mergeAndSort(List<Student> list1, List<Student> list2, Comparator<Student> comparator)
    {
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size())
        {
            if (comparator.compare(list1.get(i), list2.get(j)) > 0)
            {
                mergedList.add(list1.get(i));
                i++;
            } else
            {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size())
        {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size())
        {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}