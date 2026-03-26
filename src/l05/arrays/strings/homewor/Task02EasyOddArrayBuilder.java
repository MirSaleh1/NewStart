package l05.arrays.strings.homewor;

import java.util.Arrays;

public class Task02EasyOddArrayBuilder {

    public static void main(String[] args) {

        int[] arr = new int[50];
        int count = 0;
        for (int i = 0; i < arr.length; count++) {
            if (count % 2 == 1) {
                arr[i] = count;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
