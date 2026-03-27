package l4.controlflow.loops.homework;

import java.util.Scanner;

public class Task10HardPrimeRangeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;
        if (start > end) {
            int temp = end;
            end = start;
            start = temp;
        }
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) count++;
        }

    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i < num; i+=2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
