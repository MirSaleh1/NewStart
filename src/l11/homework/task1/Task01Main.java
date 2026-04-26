package l11.homework.task1;

public class Task01Main {

    public static void main(String[] args) {

        Days[]days=Days.values();
        Days day=null;
        for (int i = 0; i < days.length; i++) {
            day=days[i];
            System.out.println(day.ordinal()+1+" "+day.name());
        }
    }
}
