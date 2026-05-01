package task8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine().toLowerCase();
        String input2 = sc.nextLine().toLowerCase();

        if (input1.length() != input2.length()) {
            System.out.println(false);
            return;
        }
        Map<Character, Integer> wordCounter1 = new HashMap<>();
        Map<Character, Integer> wordCounter2 = new HashMap<>();
        int value = 1;

        int counter = 0;
        while (counter < input1.length()) {
            if (wordCounter1.get(input1.charAt(counter))!=null) {
                wordCounter1.put(input1.charAt(counter),
                        wordCounter1.get(input1.charAt(counter))+1);
            }
            else {
                wordCounter1.put(input1.charAt(counter),value);
            }
            if (wordCounter2.get(input2.charAt(counter))!=null) {
                wordCounter2.put(input2.charAt(counter),
                        wordCounter2.get(input2.charAt(counter))+1);
            }
            else {
                wordCounter2.put(input2.charAt(counter),value);
            }
            counter++;
        }
        System.out.println(wordCounter1.equals(wordCounter2));
    }
}
