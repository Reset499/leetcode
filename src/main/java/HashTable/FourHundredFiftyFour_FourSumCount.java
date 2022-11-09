package HashTable;

import java.util.HashMap;
import java.util.Map;

public class FourHundredFiftyFour_FourSumCount {
    public static void main(String[] args) {

    }

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int one : nums1) {
            for (int two : nums2) {
                if (map.containsKey(one + two)) map.put(one + two, map.get(one + two) + 1);
                else map.put(one + two, 1);
            }
        }
        for (int three : nums3) {
            for (int four : nums4) {
                if (map.containsKey(0 - three - four)) count += map.get(0 - three - four);
            }
        }
        return count;
    }
}
