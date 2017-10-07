package JavaLesson.lesson007;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 Заполнить список из N элементов целыми
 числами и вывести его на экран.
 Удалить все четные элементы.
 */
public class ArrayList03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        ArrayList<Integer> listInt = new ArrayList<>();
        System.out.print("Количество элементов = ");
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            listInt.add(rnd.nextInt(10) + 1);
        }
        System.out.println("Исходный список:");
        for (int i : listInt) {
            System.out.print(i + " ");
        }
        // Удаление четных элементов
        for (int i = 0; i < n; i++) {
            if (listInt.get(i) % 2 == 0) {
                listInt.remove(i);
                n--;
                i -= 1;
            }
        }

        System.out.println("\nРезультат:");
        for (int i : listInt) {
            System.out.print(i + " ");
        }


    }
}
