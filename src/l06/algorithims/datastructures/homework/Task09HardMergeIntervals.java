package l06.algorithims.datastructures.homework;

import java.util.Arrays;

public class Task09HardMergeIntervals {

    public static void main(String[] args) {

        int[][] intervals = {
                {1, 3},
                {8, 10},
                {2, 6},
                {15, 18},
                {9, 12}
        };
        bubbleSort(intervals);
        merge(intervals);
        int nullCount=0;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i]==null){
                nullCount++;
            }
        }
        int [][] intervial2=new int[intervals.length-nullCount][2];
        int count=0;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i]==null)continue;
            intervial2[count++]=intervals[i];
        }
        System.out.println(Arrays.deepToString(intervial2));
    }
    public static void bubbleSort(int[][] cloneArr) {
        for (int i = 0; i < cloneArr.length - 1; i++) {
            for (int j = 0; j < cloneArr.length - 1 - i; j++) {
                if (cloneArr[j][0] > cloneArr[j + 1][0]) {
                    int[] temp = cloneArr[j + 1];
                    cloneArr[j + 1] = cloneArr[j];
                    cloneArr[j] = temp;
                }
            }
        }
    }
    public static void merge(int[][] cloneArr) {
        for (int i = 0; i < cloneArr.length - 1; i++) {
            if (cloneArr[i] == null) continue;
            if (cloneArr[i][1] >= cloneArr[i + 1][0]) {
                cloneArr[i + 1][0] = cloneArr[i][0];
                if (cloneArr[i][1] > cloneArr[i + 1][1]) {
                    cloneArr[i + 1][1] = cloneArr[i][1];
                }
                cloneArr[i] = null;
            }
        }
    }
}
