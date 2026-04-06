package l06.algorithims.datastructures.homework;

public class Task03EasyMinMaxAndAverage {

    public static void main(String[] args) {

        int[] grades = {85, 92, 78, 65, 99, 88, 72, 91};
        System.out.printf("max=%d%n min=%d%n avrage=%f%n",maxPoint(grades)
        ,minPoint(grades),avrage(grades));
    }
    public static int maxPoint(int[] arr){
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (max<arr[i]) max=arr[i];
        }
        return max;
    }
    public static int minPoint(int[] arr){
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (min>arr[i]) min=arr[i];
        }
        return min;
    }
    public static double avrage(int[]arr){
        int sum=0;
        for (int a:arr){
            sum+=a;
        }
        return (double) sum/arr.length;
    }

}
