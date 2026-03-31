package l06.algorithims.datastructures.homework;

import java.util.Scanner;

public class Task02EasyLinearSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] grades = {85, 92, 78, 65, 99, 88, 72, 91};
        int target = sc.nextInt();
        int result = linearSearch(grades, target);
        if (result != -1) {
            System.out.println("target=" + target + "\n" +
                    "index=" + result);
        } else System.out.println("Not found");
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) return i;
        }
        return -1;
    }
}
