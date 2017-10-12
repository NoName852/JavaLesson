package JavaLesson.lesson008;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Random;

/**
 Заполнить файл N случайными целыми числами.
 Вывести на консоль числа кратные 5.
 */
public class File02 {
    public static void main(String[] args) throws Exception {
        Scanner inputKeyboard = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Введи количество чисел - ");
        int n = inputKeyboard.nextInt();
        // Заполнение файла MyText случайными числами
        FileWriter fileWriter = new FileWriter("MyText.txt");
        for (int i = 0; i < n; i++) {
            fileWriter.write(rnd.nextInt(99) + 1 + "\n");
        }
        fileWriter.close();

        // Считывание данныз из файла и вывод на консоль
        FileReader fileReader = new FileReader("MyText.txt");
        Scanner reader = new Scanner(fileReader);
        System.out.println("Числа кратные 5:");
        while (reader.hasNextLine()) {
                int number = Integer.parseInt(reader.nextLine());
                if (number % 5 == 0) {
                    System.out.println(number);
                }
        }
        fileReader.close();
    }
}
