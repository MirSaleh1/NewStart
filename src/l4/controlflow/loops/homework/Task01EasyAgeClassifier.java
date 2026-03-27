package l4.controlflow.loops.homework;

import java.util.Scanner;

public class Task01EasyAgeClassifier {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<0){
            System.out.println("invalid input");
        }else if(age>0 && age<13){
            System.out.println("child");
        } else if (age<18 ) {
            System.out.println("teen");
        } else if (age<65) {
            System.out.println("Adult");
        }else{
            System.out.println("senior");
        }
    }
}
