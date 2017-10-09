package JavaLesson.lesson008;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 Создать директорию с заданным именем.
 Поместить в эту директорию файл, с заданным именем.
 Имена директории и файла вводятся с клавиатуры
 */
public class File01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Имя диска - ");
        String nameDisc = scn.nextLine();
        System.out.println("Имя каталога - ");
        String nameDir = scn.nextLine();
        String name = nameDisc + "://" + nameDir;
        File file = new File(name);
        file.mkdir();
        System.out.println("Введи имя файла и расширение - ");
        String nameFile = scn.nextLine();
        File file2 = new File(name, nameFile);
        if (file2.exists()) {
            System.out.println("Данный файл уже существует.");
        } else {
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Директория и файл успешно созданы");
    }
}
