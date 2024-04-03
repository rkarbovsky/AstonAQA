package school.lesson4.task1;

public class Bowl {
    int food;

    public Bowl(int food) {
        this.food = food;
    }

    public int getFood (int amount) {
        System.out.println("В миску добавили " + amount + " еды");
        System.out.println("-----------------------");
        return food += amount;
    }

    public void eat (Cat cat) {
        if (cat.catFood <= food) {
            cat.satiety = true;
            food -= cat.catFood;
            System.out.println(cat.name.toUpperCase() + " покушал");
            System.out.println("В миске осталось " + food + " еды");
            System.out.println("-----------------------");
        } else {
            System.out.println("В миске мало еды - " + food + ". " + cat.name.toUpperCase() + " не покушал");
            getFood(15);
        }
    }
}
