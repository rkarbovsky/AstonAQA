package school.lesson4.task1;

public class Dog extends Animal {
    static int dogCount = 0;

    public Dog(String name, int limitRun, int limitSwim) {
        super(name, limitRun, limitSwim);
        animalCount++;
        dogCount++;
    }

    public static void getDogCount() {
        System.out.println("Всего собак = " + dogCount);
    }
}
