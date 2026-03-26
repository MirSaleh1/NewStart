package l05.arrays.strings.homewor;

public class Task03EasyAgeStats {

    public static void main(String[] args) {

        int[] arr = {20, 25, 30, 18, 45, 12, 19, 40};
        int sum = sum(arr);
        int max= arrMaxNumber(arr);
        int min=arrMinNumber(arr);
        System.out.println("min->"+min);
        System.out.println("max->"+max);
        System.out.println("sum->"+sum);
    }
    private static int arrMinNumber(int[] arr) {
       int minValue=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minValue>arr[i])minValue=arr[i];
        }
        return minValue;
    }
    private static int arrMaxNumber(int[] arr) {
        int maxValue=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxValue<arr[i])maxValue=arr[i];
        }return maxValue;
    }
    private static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
