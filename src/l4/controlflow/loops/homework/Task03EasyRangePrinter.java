package l4.controlflow.loops.homework;

import java.util.Scanner;

public class Task03EasyRangePrinter {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int firstNumber= sc.nextInt();
        int secondNumber=sc.nextInt();

        if (firstNumber>secondNumber){
            int temp=secondNumber;
            secondNumber=firstNumber;
            firstNumber=temp;
        }
        int sum=0;
        for (int i = firstNumber; i < secondNumber; i++) {
            System.out.print(i+",");
            sum+=i;
        }
        System.out.println(sum);
    }
}
