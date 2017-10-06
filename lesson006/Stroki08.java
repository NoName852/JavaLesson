package JavaLesson.lesson006;

import java.util.Scanner;

/**
 * Дано слово. Верно ли, что оно начинается и оканчивается на одну и ту же букву?
 */
public class Stroki08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите слово - ");
        String word = scn.nextLine();
        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            System.out.print("Верно");
        } else {
            System.out.print("Не верно");
        }

    }

}
