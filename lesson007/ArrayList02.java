package JavaLesson.lesson007;

import java.util.ArrayList;
import java.util.Scanner;

/**
 Дан список студентов. Добавить нового студента
 в список после определенного студента
 */
public class ArrayList02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<String> listStudent = new ArrayList<>();
        System.out.print("Количество студентов = ");
        int n = scn.nextInt();
        scn.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Введи имя студента: ");
            listStudent.add(scn.nextLine());
        }
        System.out.println("Получившейся список: ");
        for (String student : listStudent) {
            System.out.print(student + "  ");
        }
        System.out.println("\nИмя после которого вставляется новый студент - ");
        String nameSearch = scn.nextLine();
        int indexNameSearch = listStudent.indexOf(nameSearch);
        System.out.println("Вставляемое имя - ");
        String nameNew = scn.nextLine();
        listStudent.add(indexNameSearch + 1, nameNew);
        System.out.println("Получившийся список: ");
        for (String name : listStudent) {
            System.out.print(name + "  ");
        }
    }

}
