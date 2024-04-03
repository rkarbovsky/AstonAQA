package school.lesson4.task1;

public class AnimalApp {
    public static void main(String[] args) {

        Cat catMurzik = new Cat("Мурзик", 150, 0, false, 9);
        Cat catBarsik = new Cat("Барсик", 150, 0, false, 8);
        Cat catBantik = new Cat("Бантик", 150, 0, false, 7);
        Dog dogGraf = new Dog("Граф", 500, 10);
        Dog dogPushok = new Dog("Пушок", 500, 10);
        Dog dogDruzhok = new Dog("Дружок", 500, 10);
        catMurzik.run(150);
        catMurzik.swim(1);
        catBarsik.run(220);
        catBarsik.swim(0);
        catBantik.run(56);
        catBantik.swim(0);
        dogGraf.run(500);
        dogGraf.swim(5);
        dogPushok.run(656);
        dogPushok.swim(12);
        dogDruzhok.run(45);
        dogDruzhok.swim(10);

        Cat.getCatCount();
        Dog.getDogCount();
        Animal.getAnimalCount();
        System.out.println();

        Bowl bowl = new Bowl(10);
        System.out.println("В миске " + bowl.food + " еды");
        Cat[] cats = new Cat[3];
        cats[0] = catMurzik;
        cats[1] = catBarsik;
        cats[2] = catBantik;
        for (Cat cat : cats) {
            bowl.eat(cat);
        }
    }
}
