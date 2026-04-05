package l06.algorithims.datastructures.homework;


public class Task08MediumWordFrequencyMap {

    public static void main(String[] args) {

        String text = "Salam@ menim menim adim' Salehdir";
        text = text.replaceAll("[^a-zA-Z0-9 ]", "");
        String[] arr = text.split(" ");
        byte[][] arrInt = new byte[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            arrInt[i] = arr[i].getBytes();
        }
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arrInt.length; i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < arrInt.length; j++) {
                if (java.util.Arrays.equals(arrInt[i], arrInt[j])) {
                    count++;
                    visited[j] = true;
                }
            }
            if (count > 1) {
                System.out.println(arr[i] + " (Sayı: " + count + ")");
            }
        }
    }
}
