package l06.algorithims.datastructures.homework;

import java.util.Scanner;

public class Task04EasyDuplicateCounter {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[] numbers = {5, 2, 10, 5, 3, 2, 2, 15, 0, 20, 5, 10};
        int[] check= new int[21];
        for (int i = 0; i < numbers.length; i++) {
            check[numbers[i]]++;
        }
        System.out.println("ask which number ");
        int input= sc.nextInt();
        System.out.println("dublicate="+check[input]);
        int dubCount=0;
        for (int i = 0; i < check.length; i++) {
            if (check[i]>1){
                dubCount++;
            }
        }
        System.out.println("all dublicattes="+dubCount);
    }
}
