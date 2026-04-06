package l07.oop.fundamental.homework.task4;

public class Car {
    public String brand;
    public int speed;
    public int maxSpeed;

    public Car(String brand, int maxSpeed, int speed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.speed = speed;
    }
    public int accelerate(int delta){
        if (delta <= 0) return speed;
        if ( delta+speed>maxSpeed){
            speed=maxSpeed;
            return maxSpeed;
        }
     return speed+=delta;
    }
    public int brake(int delta){
        if(delta==speed || delta>speed){
            speed=0;
            return speed;
        }
        return speed-=delta;
    }
}
