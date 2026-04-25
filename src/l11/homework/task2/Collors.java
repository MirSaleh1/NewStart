package l11.homework.task2;

public enum Collors {
    RED(15),
    YELLOW(20),
    GREEN(60);

    private final int sec;

     Collors(int sec){
        this.sec=sec;
    }
    public int getCollor(){
       return sec;
    }
}
