package l12.homework.task1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task01Main {

    public static void main(String[] args) {

        ArrayList<String> studentsName=new ArrayList<>();
        studentsName.add("Saleh");
        studentsName.add("Akif");
        studentsName.add("Elekber");
        studentsName.add("Rasim");
        studentsName.add("Nicat");
        studentsName.add("Huseyn");

        System.out.println(studentsName.getFirst());
        System.out.println(studentsName.getLast());
        System.out.println(studentsName.size());
        System.out.println(studentsName.remove("Huseyn"));
        System.out.println(studentsName);
    }
}
