package StackAndQueue;

import java.util.Stack;

public class OneHundredFifty_EvalPRN {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String string : tokens){
            if(string.equals("+")){
                int i = stack.pop();
                int j = stack.pop();
                stack.push(j+i);
            }else if(string.equals("-")){
                int i = stack.pop();
                int j = stack.pop();
                stack.push(j-i);
            }else if(string.equals("*")){
                int i = stack.pop();
                int j = stack.pop();
                stack.push(j*i);
            }else if(string.equals("/")){
                int i = stack.pop();
                int j = stack.pop();
                stack.push(j/i);
            }else stack.push(Integer.valueOf(string));
        }
        return stack.pop();
    }
}
