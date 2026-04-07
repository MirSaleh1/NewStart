package l07.oop.fundamental.homework.task2;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    public double area(){
        return height*width;
    }
    public double perimeter(){
        return (height+width)*2;
    }
}
