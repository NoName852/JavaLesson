package JavaLesson.lesson006;
import java.util.Scanner;
/**
 Дана произвольная строка и слово,
 если данное слово встречается в строке,
 то заменить его символом «*»
 */
public class Stroki04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введи строку:");
        String text = scn.nextLine();
        System.out.println("Введи слово:");
        String slovo = scn.nextLine();
        text = text.replace(slovo, "*");
        System.out.println(text);

    }
}
