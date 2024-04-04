package school.lesson4.task1;

public abstract class Animal {

    private String name;
    private static int animalCount;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    void run(int distance, int limitRun) {
        if (distance <= limitRun) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать более " + limitRun + " м.");
        }
    }

    void swim(int distance, int limitSwim, boolean canSwim) {
        if (canSwim) {
            if (distance <= limitSwim) {
                System.out.println(name + " проплыл " + distance + " м.");
            } else {
                System.out.println(name + " не может проплыть более " + limitSwim + " м.");
            }
        } else {
            System.out.println("Животное не умеет плавать");
        }
    }

    public static void getAnimalCount() {
        System.out.println("Всего животных - " + animalCount + ":");
    }
}
