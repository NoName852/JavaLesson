package JavaLesson.lesson006;

import java.util.Scanner;

/**
 * Составить программу, которая:
 * а) запрашивает имя человека и повторяет его на экране;
 * б) запрашивает имя человека и повторяет его на экране с приветствием.
 */
public class Stroki09 {
    public static void main(String arg[]) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введи имя - ");
        String name = scn.nextLine();
        System.out.println(name);
        String hel;
        hel = "Привет ";
        System.out.println(hel + name);
    }

}
