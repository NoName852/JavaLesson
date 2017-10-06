package JavaLesson.lesson006;
import java.util.Scanner;
/**
 Даны две фамилии. Определить, какая из них длиннее.
 */
public class Stroki06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Первая фамилия - ");
        String first = scn.nextLine();
        System.out.print("Вторая фамилия - ");
        String second = scn.nextLine();

        if (first.length() > second.length()) {
            System.out.println("Первая больше");
        } else if (first.length() < second.length()) {
            System.out.println("Вторая больше");
        } else {
            System.out.println("Равны");
        }
    }
}
