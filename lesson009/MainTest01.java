package JavaLesson.lesson009;

import java.util.Scanner;

/**
 Тестовый класс для Task01
 */
public class MainTest01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введи двузначное число: ");
        int chislo = scn.nextInt();
        Task01 task01 = new Task01();
        task01.chislo = chislo;
        task01.raschet();
        System.out.println(task01.message + task01.result);
    }
}
