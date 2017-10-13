package JavaLesson.lesson009;

class People {
    String name;
    int age;
    double weight;

    void hello() {
        System.out.println("Меня зовут " + name);
        System.out.println("Мой возраст - " + age);
        System.out.println("Мой вес - " + weight);
    }

    void setName(String name) {
        this.name = name;
    }

    void setAgeAndWeight(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    String getName() {
        return this.name;
    }



}
