package DynamicPrograming;

import java.util.Stack;

public class SevenHundredThirtyNine_DailyTemperatures {
    public static void main(String[] args) {
        System.out.println(dailyTemperatures(new int[]{73,74,75,71,69,72,76,73}));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                result[stack.peek()] = i-stack.pop();
            }
            stack.push(i);
        }
        return result;
    }
}
