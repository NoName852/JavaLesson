package JavaLesson.lesson006;
import java.util.Scanner;
/**
 Дано название футбольного клуба. Напечатать его на экране "столбиком".
 */
public class Stroki01 {
    public static void main(String[] args) {
        String name;
        System.out.print("Введи название клуба: ");
        Scanner scn = new Scanner(System.in);
        name = scn.nextLine();
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}
