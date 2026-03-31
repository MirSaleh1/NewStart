package task;

import java.util.Arrays;

public class Task3App {

    public static void main(String[] args) {

        int[]arr=new int[100];
        arr[1]=1;
        for (int i = 0; i < arr.length-2; i++) {
            arr[i+2] =arr[i]+arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
