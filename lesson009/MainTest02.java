package JavaLesson.lesson009;

import java.util.Scanner;

/**
 Тестовый класс для Task02
 */
public class MainTest02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введи номер дня: ");
        int day = scn.nextInt();

        Task02 task02 = new Task02();
        task02.day = day;
        String nameDay = task02.nameDay();
        System.out.println(nameDay);
    }
}
