package l06.algorithims.datastructures.homework;

import java.util.Scanner;

public class Task05MediumTwoSumSorted {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50, 60, 80, 90, 100};
        int right=arr.length-1;
        int left=0;
        int input= sc.nextInt();
        while(left<right){
            int curretSum=arr[left]+arr[right];
            if (input==curretSum){
                System.out.println(arr[left]+","+left+" "+ arr[right]+","+right);
                break;
            } else if (curretSum<input) {
                left++;
            }
            else {
                right--;
            }
        }
    }
}
