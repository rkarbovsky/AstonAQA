package school.lesson4.task2;

public class FigureApp {
    public static void main(String[] args) {

        Circle circle = new Circle(5.0, "Жёлтый", "Красный");
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Белый", "Черный");
        Triangle triangle = new Triangle(7.0, 10.0, 12.0, "Синий", "Зелёный");

        System.out.println("Круг:");
        circle.figureInfo();
        System.out.println("\nПрямоугольник:");
        rectangle.figureInfo();
        System.out.println("\nТреугольник:");
        triangle.figureInfo();
    }
}
