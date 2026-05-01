package l12.homework.task7;

import java.util.HashMap;
import java.util.Map;

public class Task07Main {

    public static void main(String[] args) {

        String centens="Hello my name is Saleh Hello do you get what is my name";
        String[]words=centens.split(" ");
        Map<String,Integer>counterWord=new HashMap<>();
        int counter=1;
        for (int i = 0; i < words.length; i++) {
            if (counterWord.containsKey(words[i])){
                counterWord.put(words[i],counterWord.get(words[i])+1);
                continue;
            }
            counterWord.put(words[i],counter );
        }
    }
}
