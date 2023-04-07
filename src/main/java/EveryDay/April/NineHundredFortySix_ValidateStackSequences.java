package EveryDay.April;

import java.util.ArrayDeque;
import java.util.Deque;

public class NineHundredFortySix_ValidateStackSequences {
    public static void main(String[] args) {

    }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = pushed.length;
        //i循环的是pushed数组,将其一个个压入栈中,j记录下一个该出栈的元素
        for (int i = 0, j = 0; i < n; i++) {
            stack.push(pushed[i]);
            while(!stack.isEmpty()&&stack.peek()==popped[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }
}
