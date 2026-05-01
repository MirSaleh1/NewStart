package task9.task3;

import java.util.List;

public class GetElement {

    public <T> T getFirts(List<T> list){
        if (list.isEmpty()){
            return null;
        }
        return list.getFirst();
    }
}
