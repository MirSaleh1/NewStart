package task9.task6;

import java.util.List;

public class Storage<T> {
    private List<T>lists;

    public boolean add(T element){
        lists.add(element);
        return true;
    }
    public List<T> getLists(){
        return lists;
    }
}
