package task9.task5;

import java.util.List;

public class Contains {

    public <T> boolean contains(List<T>list,T element){
        if (list.contains(element))return true;
        return false;
    }
}
