package l10.homework.task4;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }
    public void printName() {
        System.out.println("name: " + name);
    }
    public abstract double area();
}
