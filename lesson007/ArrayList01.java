package JavaLesson.lesson007;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Заполнить ArrayList именами вводимыми с клавиатуры.
 * Прекратить ввод, как только будет введено искомое имя
 */
public class ArrayList01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введи искомое имя: ");
        String nameSearch = scn.nextLine();
        ArrayList<String> listName = new ArrayList<>();
        String nameInput;
        do {
            System.out.print("Введи имя: ");
            nameInput = scn.nextLine();
            listName.add(nameInput);
        } while (!nameInput.equals(nameSearch));

        for (String name : listName) {
            System.out.println(name);
        }
    }
}
