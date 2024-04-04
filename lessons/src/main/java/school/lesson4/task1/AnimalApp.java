package school.lesson4.task1;

public class AnimalApp {
    public static void main(String[] args) {

        Cat catMurzik = new Cat("Мурзик");
        Cat catBarsik = new Cat("Барсик");
        Cat catBantik = new Cat("Бантик");

        Dog dogGraf = new Dog("Граф");
        Dog dogPushok = new Dog("Пушок");
        Dog dogDruzhok = new Dog("Дружок");

        catMurzik.run(150, catMurzik.getLimitRun());
        catMurzik.swim(12, catMurzik.getLimitSwim(), catMurzik.isCanSwim());
        catBarsik.run(220, catBarsik.getLimitRun());
        catBarsik.swim(30, catBarsik.getLimitSwim(), catBarsik.isCanSwim());
        catBantik.run(56, catBantik.getLimitRun());
        catBantik.swim(5, catBantik.getLimitSwim(), catBantik.isCanSwim());
        dogGraf.run(500, dogGraf.getLimitRun());
        dogGraf.swim(5, dogGraf.getLimitSwim(), dogGraf.isCanSwim());
        dogPushok.run(456, dogPushok.getLimitRun());
        dogPushok.swim(12, dogPushok.getLimitSwim(), dogPushok.isCanSwim());
        dogDruzhok.run(845, dogDruzhok.getLimitRun());
        dogDruzhok.swim(10, dogDruzhok.getLimitSwim(), dogDruzhok.isCanSwim());

        Animal.getAnimalCount();
        Cat.getCatCount();
        Dog.getDogCount();

        // тарелка
        Bowl bowl = new Bowl(15);
        Cat[] cats = new Cat[3];
        cats[0] = catMurzik;
        cats[1] = catBarsik;
        cats[2] = catBantik;
        catMurzik.setAppetite(10);
        catBarsik.setAppetite(15);
        catBantik.setAppetite(20);
        for (Cat cat : cats) {
            if (!cat.isSatiety() && cat.getAppetite() <= bowl.getFood()) {
                cat.eat(bowl);
                cat.setSatiety(true);
            } else {
                System.out.println("Котик не покушал");
                bowl.addFood(25);
            }
            bowl.info();
        }
    }
}
