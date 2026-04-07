package l07.oop.fundamental.homework.task12;

import java.util.Scanner;

public class Task12HardMiniSchoolSystem {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        boolean exit=false;
        Student student=new Student("Saleh",20);
        Teacher teacher=new Teacher("Seyran","Riyaziyyat");
        SchoolService schoolService=new SchoolService(10,10);
        while (!exit){
            showMenu();
            int input= sc.nextInt();
            switch (input){
                case 1:
                    System.out.print("Enter student name: ");
                    String sName = sc.next();
                    System.out.print("Enter student age: ");
                    int sAge = sc.nextInt();
                    schoolService.addStudent(new Student(sName, sAge));
                    break;
                case 2:
                    System.out.print("Enter teacher name: ");
                    String tName = sc.next();
                    System.out.print("Enter subject: ");
                    String subject = sc.next();
                    schoolService.addTeacher(new Teacher(tName, subject));
                    break;
                case 3:schoolService.printAll();break;
                case 0:
                    System.out.println("Exiting...");exit=true;
                    break;
                default:
                    System.out.println("incorrect input");
                    break;
            }
        }
    }
    public static void showMenu() {
        System.out.println("\n========== SCHOOL MANAGEMENT SYSTEM ==========");
        System.out.println("1. Add a New Student");
        System.out.println("2. Add a New Teacher");
        System.out.println("3. List All Students and Teachers");
        System.out.println("0. Exit the Program");
        System.out.println("==============================================");
        System.out.print("Please enter your choice: ");
    }
}
