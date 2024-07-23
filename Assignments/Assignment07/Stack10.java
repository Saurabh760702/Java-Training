package Assignment07;

import java.util.Stack;

public class Stack10 {
        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();

            for (int i = 1; i <= 10; i++) {
                stack.push(i);
            }

            System.out.println("Original Stack: " + stack);

            System.out.println("Elements removed from stack:");
            for (int i = 0; i < 4; i++) {
                int removedElement = stack.pop();
                System.out.println(removedElement);
            }
            System.out.println("Stack after removing elements: " + stack);
        }
    }
