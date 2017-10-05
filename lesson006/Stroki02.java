package JavaLesson.lesson006;
import java.util.Scanner;
/**
 Дано слово s. Получить слово t, получаемое путем прочтения слова s начиная
 с его конца.
 */
public class Stroki02 {
    public static void main(String[] args) {
        String slovoS;
        String slovoT = new String();
        Scanner scn = new Scanner(System.in);
        System.out.print("Исходное слово - ");
        slovoS = scn.nextLine();
        for (int i = slovoS.length() - 1; i >= 0; i--) {
            slovoT = slovoT + slovoS.charAt(i);
        }
        System.out.println("Полученное слово - " + slovoT);

    }
}
