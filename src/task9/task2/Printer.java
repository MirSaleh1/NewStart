package task9.task2;

import java.util.List;

public class Printer {

    public <T>void printList(List<T>list){
        list.forEach(System.out::println);
    }
}
