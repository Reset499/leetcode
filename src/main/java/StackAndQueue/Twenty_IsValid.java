package StackAndQueue;

import java.util.Stack;

public class Twenty_IsValid {
    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (stack.empty()) {stack.push(c);continue;}
            if (c == ']') {
                if (stack.pop() != '[') return false;
            } else if (c == '}') {
                if (stack.pop() != '{') return false;
            } else if (c == ')') {
                if (stack.pop() != '(') return false;
            }else stack.push(c);
        }
        if (!stack.isEmpty()) return false;
        return true;
    }
}
