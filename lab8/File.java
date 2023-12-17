package lab8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите путь к файлу: ");
        String filePath = scanner.nextLine();

        System.out.print("Введите новую информацию для записи в файл (введите 'конец' для завершения ввода):\n");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)))
        {
            String line;
            while (!(line = scanner.nextLine()).equalsIgnoreCase("конец"))
            {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Информация успешно записана в файл.");
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println("Ошибка при записи в файл.");
        }
        finally
        {
            scanner.close();
        }
    }
}