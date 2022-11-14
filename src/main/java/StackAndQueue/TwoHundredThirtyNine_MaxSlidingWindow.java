package StackAndQueue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class TwoHundredThirtyNine_MaxSlidingWindow {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(maxSlidingWindow(nums, 3));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[nums.length - k + 1];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && deque.peek() < i - k + 1) deque.poll();
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) deque.pollLast();
            deque.offer(i);
            if (i >= k - 1) result[index++] = nums[deque.peek()];
        }
        return result;
    }
}
