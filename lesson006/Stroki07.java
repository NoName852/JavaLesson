package JavaLesson.lesson006;
import java.util.Scanner;
/**
 Составить программу, которая запрашивает отдельно имя и отдельно
 фамилию, а затем выводит их как одну символьную строку.
 */
public class Stroki07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введи имя - ");
        String name = scn.nextLine();
        System.out.print("Введи фамилию - ");
        String fam = scn.nextLine();
        String str = name.concat(" " + fam);
        System.out.println(str);
    }
}
