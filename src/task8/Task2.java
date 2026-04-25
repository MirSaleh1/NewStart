package task8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String input= sc.next();
        Map<Character,Integer> wordCounter=new HashMap<>() ;
        int value=1;
        for (int i = 0; i < input.length(); i++) {
            if (wordCounter.containsKey(input.charAt(i))){
                wordCounter.put(input.charAt(i),wordCounter.get(input.charAt(i))+1);
                continue;
            }
            wordCounter.put(input.charAt(i),value);
        }
        for (Map.Entry<Character, Integer> entry : wordCounter.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("Hərf: " + entry.getKey() + ", Sayı: " + entry.getValue());
                break;
            }
        }
    }
}
