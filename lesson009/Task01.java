package JavaLesson.lesson009;

/**
 * Написать класс, находящий
 * сумму цифр двузначного числа, если цифры четные,
 * произведение, если нечетные
 * разность, в остальных случаях
 * Написать тестовый класс для проверки
 */
public class Task01 {
    int chislo;
    int result;
    String message;

    void raschet() {
        int first = chislo / 10;
        System.out.println("Первое составляющее число = " + first);
        int second = chislo % 10;
        System.out.println("Второе составляющее число = " + second);

        if (first % 2 == 0 && second % 2 == 0) {
            result = first + second;
            message = "Числа четные. Их сумма = ";
        } else if (first % 2 != 0 && second % 2 != 0) {
            result = first * second;
            message = "Числа нечетные. Их произведение = ";
        } else {
            result = first - second;
            message = "Разность чисел = ";
        }
    }
}
