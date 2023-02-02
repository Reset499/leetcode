package MonotonicStack;

import java.util.*;

public class FourHundredNinetySix {
    public static void main(String[] args) {
        System.out.println(nextGreaterElement(new int[]{2,4},new int[]{1,2,3,4}));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack();
        int[] result = new int[nums1.length];
        Arrays.fill(result,-1);
        for(int i = 0;i<nums1.length;i++) map.put(nums1[i],i);
        for(int i = 0;i<nums2.length;i++){
            while(!stack.empty()&&nums2[i]>stack.peek()){
                if(map.containsKey(stack.peek())) result[map.get(stack.pop())] = nums2[i];
                else break;
            }
            stack.push(nums2[i]);
        }
        return result;
    }
}
