package l06.algorithims.datastructures.homework;

public class Task06MediumSlidingWindowMaxSum {

    public static void main(String[] args) {

        int[] arr= {10, 20, 30, 40, 50, 60,80,90,100};
        int k=3;
        int currentSum =0;
        for (int i = 0; i < k; i++) {
            currentSum+=arr[i];
        }
        int maxSum=currentSum;
        for (int i = k; i < arr.length; i++) {
            currentSum=currentSum-arr[i-k]+arr[i];
            if (currentSum>maxSum)maxSum=currentSum;
        }
        System.out.println(maxSum);
    }
}
