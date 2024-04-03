package school.lesson4.task1;

public class Cat extends Animal {
    public static int catCount = 0;
    boolean satiety;
    public int catFood;

    public Cat(String name, int limitRun, int limitSwim, boolean satiety, int catFood) {
        super(name, limitRun, limitSwim);
        animalCount++;
        catCount++;
        this.satiety = satiety;
        this.catFood = catFood;
    }

    public static void getCatCount() {
        System.out.println("Всего котов = " + catCount);
    }
}
