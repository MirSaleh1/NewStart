package l10.homework.task4;

public class Circle extends Shape{
    private double radius;
    public Circle(String name) {
        super(name);
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }
}
