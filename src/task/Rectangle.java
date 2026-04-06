package task;

public class Rectangle {
    private double lenght;
    private double width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double area(){
       return lenght*width;
    }
    public double perimeter(){
        return(lenght+width)*2;
    }
    public boolean isSquare(){
      return   this.width==this.lenght;
    }
    public void printDetails(){
        System.out.println("widht="+width);
        System.out.println("lenght="+lenght);
    }
}
