package prac5;

import java.util.Scanner;

public class Count
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int count = countOnesInSequence(scanner);
        System.out.println("Количество единиц в последовательности: " + count);
    }

    private static int countOnesInSequence(Scanner scanner)
    {
        int count = 0;
        boolean encounteredTwoZeros = false;

        while (true)
        {
            try
            {
                int number = scanner.nextInt();

                if (number == 1 && !encounteredTwoZeros)
                {
                    count++;
                }
                else if (number == 0)
                {
                    if (encounteredTwoZeros)
                    {
                        break;
                    }
                    encounteredTwoZeros = true;
                }
            }
            catch (Exception e)
            {
                break;
            }
        }

        return count;
    }
}