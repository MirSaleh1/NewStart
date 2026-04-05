package l06.algorithims.datastructures.homework;

import java.util.Stack;

public class Task07MediumBracketValidatorStack {

    public static void main(String[] args) {

        String input = "({[]})";
        Stack<Character> srr = new Stack<>();
        boolean result = true;

        for (int i = 0; i < input.length(); i++) {
            char counter = input.charAt(i);
            if (result != true) break;
            if (counter == '[' || counter == '{' || counter == '(') {
                srr.push(counter);
            } else {
                if (srr.isEmpty()){
                    result=false;
                    break;
                }
                char c = srr.pop();
                if (c == '{' && counter != '}') result = false;
                else if (c == '(' && counter != ')') result = false;
                else if (c == '[' && counter != ']') result=false;
            }
        }
        if (!srr.empty()){
            result=false;
        }
        System.out.println(result);
    }
}



