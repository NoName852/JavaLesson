package JavaLesson.lesson008;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Записать в текстовый файл слова, каждое с новой строки.
 * Создать другой файл, в который поместить все слова из первого,
 * начиная с последнего слова
 */
public class File05 {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.print("Кол-во слов = ");
        int n = scn.nextInt();
        scn.nextLine();
        //Записываем слова вводимые с клавиатуры в первый файл
        FileWriter fw = new FileWriter("MyText.txt");
        for (int i = 0; i < n; i++) {
            System.out.print("Слово -");
            fw.write(scn.nextLine() + "\n");
        }
        fw.close();
        //Считываем слова из первого файла и заносим их в ArrayList
        FileReader fr = new FileReader("MyText.txt");
        Scanner reader = new Scanner(fr);
        ArrayList<String> listWord = new ArrayList<>();
        while (reader.hasNextLine()) {
            listWord.add(reader.nextLine());
        }
        //Записываем слова в новый файл начиная с последнего
        FileWriter fw2 = new FileWriter("MyText2.txt");
        for (int i = listWord.size() - 1; i >= 0; i--) {
            fw2.write(listWord.get(i) + "\n");
        }
        fw2.close();
    }


}
