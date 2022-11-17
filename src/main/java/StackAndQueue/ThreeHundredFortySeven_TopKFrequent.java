package StackAndQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ThreeHundredFortySeven_TopKFrequent {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        topKFrequent(nums,2);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((n1, n2) -> n1[1] - n2[1]);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (priorityQueue.size() < k)
                priorityQueue.add(new int[]{entry.getKey(), entry.getValue()});
            else {
                if (entry.getValue() > priorityQueue.peek()[1]) {
                    priorityQueue.poll();
                    priorityQueue.add(new int[]{entry.getKey(), entry.getValue()});
                }
            }
        }
        for (int i = 0; i < k; i++) {
            result[i] = priorityQueue.poll()[0];
        }
        return result;
    }
}
