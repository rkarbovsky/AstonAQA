package school.lesson4.task1;

public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void addFood(int amount) {
        System.out.println("В миску добавили " + amount + " еды");
        food += amount;
    }

    public void eatFood(int amount) {
        food -= amount;
    }

    public void info() {
        System.out.println("В миске осталось " + food + " еды");
    }
}
