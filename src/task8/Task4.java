package task8;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Map<Integer,Integer>map=new HashMap<>();
        int target=9;
        for (int i = 0; i < 5; i++) {
            int input = sc.nextInt();
            int needKey=target-input;
            if (map.containsKey(needKey)){
                map.put(input,i);
                System.out.println("find"+ map.get(input) + " " + map.get(needKey));
                break;
              }
            map.put(input, i);
        }
    }
}
