package school.lesson4.task1;

public class Animal {

    String name;
    int limitRun;
    int limitSwim;
    static int animalCount = 0;

    public Animal(String name, int limitRun, int limitSwim) {
        this.name = name;
        this.limitRun = limitRun;
        this.limitSwim = limitSwim;
    }

    void run (int distance) {
        if (distance <= limitRun) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать более " + limitRun + " м.");
        }
    }

    void swim (int distance) {
        if (distance <= limitSwim && distance != 0) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else if (limitSwim == 0) {
            System.out.println("Коты не умеют плавать");
        } else {
            System.out.println(name + " не может проплыть более " + limitSwim + " м.");
        }
    }

    public static void getAnimalCount() {
        System.out.println("Всего животных = " + animalCount);
    }
}
