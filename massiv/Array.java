package massiv;

public class Array
{
    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sumFor = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            sumFor += numbers[i];
        }
        System.out.println("Сумма элементов массива (for) = " + sumFor);

        int sumWhile = 0;
        int i = 0;
        while (i < numbers.length)
        {
            sumWhile += numbers[i];
            i++;
        }
        System.out.println("Сумма элементов массива (while) = " + sumWhile);

        int sumDoWhile = 0;
        int j = 0;
        do {
            sumDoWhile += numbers[j];
            j++;
        } while (j < numbers.length);
        System.out.println("Сумма элементов массива (do-while) = " + sumDoWhile);
    }
}