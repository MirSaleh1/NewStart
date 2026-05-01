package l12.homework.task4;

import java.util.HashMap;
import java.util.Map;

public class Task04Main {

    public static void main(String[] args) {

        HashMap<Integer,String>idAndName=new HashMap<>();

        idAndName.put(1,"Saleh");
        idAndName.put(2,"Akif");
        idAndName.put(3,"Sema");
        idAndName.put(4,"Huseyn");
        idAndName.put(5,"Hesen");

        System.out.println(idAndName.get(3));
        System.out.println(idAndName.remove(4));

        for(Map.Entry<Integer,String>person:idAndName.entrySet()){
            System.out.println(person);
        }
    }
}
