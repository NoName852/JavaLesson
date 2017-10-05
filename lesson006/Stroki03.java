package JavaLesson.lesson006;
import java.util.Scanner;

/**
 Дан текст. Определить, сколько в нем предложений.
 */
public class Stroki03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = 0;
        String text;
        System.out.println("Введи текст - ");
        text = scn.nextLine();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.') {
                k++;
            }
        }
        System.out.println("Количество предложений = " + k);
    }
}
