package l12.homework.task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task05Main {

    public static void main(String[] args) {

        List<Integer>num=new ArrayList<>();
        int count=0;
        while (num.size()<30){
            num.add(++count);
        }
        Iterator<Integer>numIf=num.iterator();
        while (numIf.hasNext()){
            Integer current = numIf.next();
            if (current%2==1){
                numIf.remove();
            }
        }
        System.out.println(num);
    }
}
