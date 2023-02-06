package MonotonicStack;

import java.util.Arrays;
import java.util.Stack;

public class FiveHundredThree_NextGreaterElements {
    public static void main(String[] args) {
    }
    public int[] nextGreaterElements(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];
        Arrays.fill(result,-1);
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<size*2;i++){
            while (!stack.empty()&&nums[i%size]>nums[stack.peek()]){
                result[stack.pop()] = nums[i%size];
            }
            stack.push(i%size);
        }
        return result;
    }
}
