package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class One_TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(hashtable.containsKey(target-nums[i])){
                return new int[]{hashtable.get(target-nums[i]),i};
            }
            hashtable.put(nums[i],i);
        }
        return null;
    }
//暴力枚举法
//    public static int[] twoSum(int[] nums, int target) {
//        int[] result = new int[2];
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] + nums[i] == target) {
//                    result[0] = i;
//                    result[1] = j;
//                    return result;
//                }
//            }
//        }
//        return null;
//    }
}
