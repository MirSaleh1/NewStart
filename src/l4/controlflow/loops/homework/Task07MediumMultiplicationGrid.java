package l4.controlflow.loops.homework;

import java.util.Scanner;

public class Task07MediumMultiplicationGrid {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
         int include= sc.nextInt();
         int sumAllColum=0;
        for (int i = 1; i < include+1; i++) {
            int sumCollum=0;
            for (int j = 1; j <include+1 ; j++) {
                int result=i*j;
                System.out.printf("%d * %d=%d%n",i,j,result);
                sumCollum+=result;
                sumAllColum+=result;
            }
            System.out.println("-------------"+sumCollum);
            System.out.println("-----------------------");
        }
        System.out.println(sumAllColum);
    }
}
