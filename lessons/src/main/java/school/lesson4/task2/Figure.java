package school.lesson4.task2;

public interface Figure {
    double getPerimeter();

    double getArea();

    String getColorFill();

    String getColorBorder();

    default void figureInfo() {
        System.out.println("Периметр = " + getPerimeter());
        System.out.println("Площадь = " + getArea());
        System.out.println("Цвет фона " + getColorFill());
        System.out.println("Цвет границы " + getColorBorder());
    }
}

class Circle implements Figure {
    private double radius;
    private String fillColor;
    private String borderColor;


    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getColorFill() {
        return fillColor;
    }

    @Override
    public String getColorBorder() {
        return borderColor;
    }
}

class Rectangle implements Figure {
    private double height;
    private double width;
    private String fillColor;
    private String borderColor;


    public Rectangle(double height, double width, String fillColor, String borderColor) {
        this.height = height;
        this.width = width;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }


    @Override
    public double getPerimeter() {
        return height + width + height + width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public String getColorFill() {
        return fillColor;
    }

    @Override
    public String getColorBorder() {
        return borderColor;
    }
}

class Triangle implements Figure {
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    private String fillColor;
    private String borderColor;


    public Triangle(double sideOne, double sideTwo, double sideThree, String fillColor, String borderColor) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }


    @Override
    public double getPerimeter() {
        return sideOne + sideTwo + sideThree;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
    }

    @Override
    public String getColorFill() {
        return fillColor;
    }

    @Override
    public String getColorBorder() {
        return borderColor;
    }
}
