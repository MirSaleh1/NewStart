package l06.algorithims.datastructures.homework;

public class Task10HardBinarySearchCapacity {

    public static void main(String[] args) {

        int[] weights = {1, 2, 3, 4, 5};
        int days = 5;
        System.out.println(shipWithinDays(weights,days));
    }
    public static int shipWithinDays(int[] weights,int days){
        int left=5;
        int right=15;
        while (left<right) {
            int mid = left + (right - left) / 2;
            if(capasityShip(mid,weights,days)){
                right=mid;
            }
            else{
                left=mid+1;
            }
        } return left;
    }
    public static boolean capasityShip(int capacity,int[] weights,int days){
       int currentDays=1;
       int currentSum=0;
        for (int w : weights) {
            if (currentSum + w > capacity) {
                currentDays++;
                currentSum = 0;
            }
            currentSum += w;
        }
        return currentDays <= days;
    }
}
