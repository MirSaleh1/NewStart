package task9.task8.exseptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        students.add(new Student("Saleh", "123"));
        students.add(new Student("Taleh", "321"));
        students.add(new Student("valeh", "333"));
        while (true) {
            try {
                if (students.contains(new Student(scanner.nextLine(), scanner.nextLine()))) {
                    System.out.println("seccsesfull");
                    System.out.println(students);
                    return;
                } else {
                    throw new UserNotFound("USER DOES'T EXSIST");
                }
            }catch (UserNotFound e){
                System.out.println(e);
            }
        }
    }
}
