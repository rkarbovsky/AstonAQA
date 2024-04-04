package school.lesson4.task1;

public class Cat extends Animal {
    private static int catCount;
    private boolean satiety;
    private int appetite;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public static void getCatCount() {
        System.out.println(" - котов - " + catCount);
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public int getLimitRun() {
        return 200;
    }

    public boolean isCanSwim() {
        return false;
    }

    public int getLimitSwim() {
        return 0;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void eat(Bowl bowl) {
        System.out.println("Котик скушал " + appetite + " еды");
        bowl.eatFood(appetite);
    }
}
