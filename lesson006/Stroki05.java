package JavaLesson.lesson006;
import java.util.Scanner;
/**
 Дано название города. Определить, четно или нет количество символов в нем.
 */
public class Stroki05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введи название города - ");
        String nameCity = scn.nextLine();

        if (nameCity.length() % 2 == 0) {
            System.out.println("Количество символов четное");
        } else {
            System.out.println("Количество символов нечетное");
        }

    }
}
