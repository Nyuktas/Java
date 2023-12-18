package prac5;

import java.util.ArrayList;
import java.util.Scanner;

public class AlternateNumbers
{
    public static void main(String[] args)
    {
        printAlternateNumbers();
    }

    private static void printAlternateNumbers()
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Введите последовательность чисел (завершите ввод числом 0):");

        while (true)
        {
            try
            {
                int number = scanner.nextInt();
                if (number == 0)
                {
                    break;
                }
                numbers.add(number);
            }
            catch (Exception e)
            {
                break;
            }
        }

        System.out.println("Нечетные числа в последовательности:");
        for (int i = 0; i < numbers.size(); i += 2)
        {
            System.out.println(numbers.get(i));
        }
    }
}