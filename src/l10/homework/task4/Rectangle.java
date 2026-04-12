package l10.homework.task4;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return height*width;
    }
}
