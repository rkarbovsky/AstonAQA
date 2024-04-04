package school.lesson4.task1;

public class Dog extends Animal {
    private static int dogCount;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static void getDogCount() {
        System.out.println(" - собак - " + dogCount);
    }

    public boolean isCanSwim() {
        return true;
    }

    public int getLimitRun() {
        return 500;
    }

    public int getLimitSwim() {
        return 10;
    }
}
