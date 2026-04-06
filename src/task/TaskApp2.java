package task;

public class TaskApp2 {

    public static void main(String[] args) {

        int[] arr={3,1,6,4,8,5,6,0,3,-1};
        bubbleSort(arr);
        System.out.println(arr[0]+" "+arr[arr.length-1]);
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
