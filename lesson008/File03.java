package JavaLesson.lesson008;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Random;

/**
 Записать в файл N случайных целых чисел.
 Определить в этом файле минимальный и максимальный элемент.
 */
public class File03 {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Количество чисел = ");
        int n = scn.nextInt();

        FileWriter fw = new FileWriter("MyText.txt");
        for (int i = 0; i < n; i++) {
            fw.write(scn.nextInt() + "\n");
        }
        fw.close();

        FileReader fr = new FileReader("MyText.txt");
        Scanner reader = new Scanner(fr);
        int min = Integer.parseInt(reader.nextLine());
        int max = Integer.parseInt(reader.nextLine());


        while (reader.hasNextLine()) {
            int a = Integer.parseInt(reader.nextLine());
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
        }
        System.out.println("Минимальное - " + min);
        System.out.println("Максимальное - " + max);

    }
}
