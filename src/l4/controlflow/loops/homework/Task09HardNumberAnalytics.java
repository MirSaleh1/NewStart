package l4.controlflow.loops.homework;

import java.util.Scanner;

public class Task09HardNumberAnalytics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        int sum = 0, min = 0, max = 0;
        int prevNumber=sc.nextInt();
        min=prevNumber;max=prevNumber;
        sum+=prevNumber;
        int count = 0,pCount=0,nCount=0,zCount=0;
        if (prevNumber < 0) nCount++;
        else if (prevNumber == 0) zCount++;
        else pCount++;

        for (int i = 1; i < loop; i++) {
            count = i+1;
            int number = sc.nextInt();
            if (number<0)nCount++;
            else if (number==0)zCount++;
            else pCount++;
            sum += number;
            min = min(min, number);
            max = max(max, number);

        }
        printSummary(sum,avg(sum,count),min,max,pCount,nCount,zCount);
    }

    public static int min(int m, int n) {
        if (m > n) return n;
        return m;
    }

    public static int max(int m, int n) {
        if (m < n) return n;
        return m;

    }
    public static double avg(int sum,int count){
        return (double) sum / count;
    }
    public static void printSummary(int sum, double avg, int min, int max, int p, int n, int z) {
        System.out.println("\n--- ANALİTİKA HESABATI ---");
        System.out.println("Cəm: " + sum);
        System.out.println("Orta: " + avg);
        System.out.println("Ən kiçik: " + min);
        System.out.println("Ən böyük: " + max);
        System.out.println("Müsbət sayı: " + p);
        System.out.println("Mənfi sayı: " + n);
        System.out.println("Sıfır sayı: " + z);
    }
}
