package JavaLesson.lesson009;

/**
 Написать класс, который в зависимости от введенного числа
 возвращает день недели. Написать тестовый класс для проверки
 */
public class Task02 {
    int day;

    String nameDay() {
        String message;

        switch (day) {
            case 1 :
                message = "Понедельник";
                break;
            case 2 :
                message = "Вторник";
                break;
            case 3 :
                message = "Среда";
                break;
            case 4 :
                message = "Четверг";
                break;
            case 5 :
                message = "Пятница";
                break;
            case 6 :
                message = "Суббота";
                break;
            case 7 :
                message = "Воскресенье";
                break;
            default :
                message = "Такого дня не существует";
                break;
        }
        return message;
    }
}
