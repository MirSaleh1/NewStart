package l11.homework.task4;

public class Task04Main {

    public static void main(String[] args) {

        Vehicle[] vehicles=new Vehicle[3];
        vehicles[0]=new Car();
        vehicles[1]=new Bike();
        vehicles[2]=new Vehicle();

        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
