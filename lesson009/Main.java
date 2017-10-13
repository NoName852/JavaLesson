package JavaLesson.lesson009;


public class Main {
    public static void main(String[] args) {
        People oleg = new People();
        oleg.setName("Олег");
        oleg.setAgeAndWeight(40, 80);
        oleg.hello();

        People vasia = new People();
        vasia.setName("Вася");
        vasia.setAgeAndWeight(50, 100);
        vasia.hello();


    }
}
