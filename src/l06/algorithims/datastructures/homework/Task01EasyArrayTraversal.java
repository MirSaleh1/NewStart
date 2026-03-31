package l06.algorithims.datastructures.homework;

public class Task01EasyArrayTraversal {

    public static void main(String[] args) {
        int[] arr = {1, 23, 5, 2, 6, 8, 5, 3, 2, 6, 8, 9};
        printDetails(arr);
        System.out.println(sum(arr));
        oddAndEvenNumbers(arr);
    }

    public static void printDetails(int[] arr) {
        for (int a : arr) {
            System.out.print(a);
        }
        System.out.println();
    }
    public static int sum(int[] arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }
    public static void oddAndEvenNumbers(int[] arr) {
        int oddNumCounter = 0;
        int evenNumCounter = 0;
        for (int a : arr) {
            if (a % 2 == 1) {
                oddNumCounter++;
            } else {
                evenNumCounter++;
            }
        }
        System.out.println("odd="+oddNumCounter+"\n" +
                "even="+evenNumCounter);
    }
}