package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class OneThousandFortySeven_removeDuplicates {
    public static void main(String[] args) {

    }

    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if(stack.isEmpty()) stack.push(c);
            else if(stack.peek() == c) stack.pop();
            else stack.push(c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while(!stack.isEmpty())
            stringBuilder.append(stack.pop());
        return new String(stringBuilder.reverse());
    }
}
