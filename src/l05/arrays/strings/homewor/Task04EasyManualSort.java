package l05.arrays.strings.homewor;

import java.util.Arrays;

public class Task04EasyManualSort {

    public static void main(String[] args) {

        int[] original = {25, 10, 3, 5, 30, 15, 20};
        int[] cloneArr= original.clone();
        bubbleSort(cloneArr);
        System.out.println("clone---" +Arrays.toString(cloneArr));
        System.out.println("main---"+Arrays.toString(original));
    }
    private static void bubbleSort(int[] cloneArr) {
        for (int i = 0; i < cloneArr.length-1; i++) {
            for (int j = 0; j < cloneArr.length-1-i; j++) {
                if (cloneArr[j]>cloneArr[j+1]){
                  int temp=cloneArr[j+1];
                  cloneArr[j+1]=cloneArr[j];
                  cloneArr[j]=temp;
                }
            }
        }
    }
}
