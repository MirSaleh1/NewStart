package l12.homework.task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task06Main {

    public static void main(String[] args) {

        List<Person>people=new ArrayList<>();

        people.add(new Person("Saleh",21));
        people.add(new Person("Akif",22));
        people.add(new Person("Huseyn",23));
        people.add(new Person("Samir",24));
        people.add(new Person("Zulifgar",25));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.name.compareTo(o1.name);
            }
        });
        System.out.println(people);

    }
}
