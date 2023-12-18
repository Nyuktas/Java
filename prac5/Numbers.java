package prac5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        printOddNumbers();
    }

    private static void printOddNumbers()
    {
        Scanner scanner = new Scanner(System.in);
        List<Integer> oddNumbers = new ArrayList<>();

        int number;

        System.out.println("Введите последовательность чисел (завершите ввод числом 0):");

        while (true)
        {
            try
            {
                number = scanner.nextInt();
                if (number == 0)
                {
                    break;
                }
                if (number % 2 != 0)
                {
                    oddNumbers.add(number);
                }
            }
            catch (Exception e)
            {
                break;
            }
        }

        if (!oddNumbers.isEmpty())
        {
            System.out.println("Нечетные числа в последовательности:");
            for (int oddNumber : oddNumbers)
            {
                System.out.println(oddNumber);
            }
        }
        else
        {
            System.out.println("В последовательности нет нечетных чисел.");
        }
    }
}