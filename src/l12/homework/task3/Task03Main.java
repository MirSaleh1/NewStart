package l12.homework.task3;

import java.util.HashSet;

public class Task03Main {

    public static void main(String[] args) {

        HashSet<String>counties=new HashSet<>();

        counties.add("Azerbaycan");
        counties.add("Turkey");
        counties.add("Russian");
        counties.add("America");
        System.out.println(counties.add("Azerbaycan"));

        System.out.println(counties.size());
        System.out.println(counties);
    }
}
