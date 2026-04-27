package l12.homework.task8;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Task08Main {

    public static void main(String[] args) {

        Deque<String> stack = new ArrayDeque<>();
        Deque<String> queue = new ArrayDeque<>();

        stack.push("Hello");
        stack.push("World");
        stack.poll();

        queue.offer("Salam");
        queue.offer("Dunya");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        while ((!queue.isEmpty())){
            System.out.println(queue.poll());
        }

    }
}
