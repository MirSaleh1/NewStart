package l12.homework.task2;

import java.util.LinkedList;

public class Task02Main {

    public static void main(String[] args) {

        LinkedList<String>strings=new LinkedList<>();

        strings.addLast("Salam");
        strings.addLast("Hello");
        strings.addLast("Privet");
        strings.addLast("Holla");
        strings.addLast("comeyesta");

        while (!strings.isEmpty()) {
            strings.pollFirst();
            System.out.println(strings);
        }
    }
}
