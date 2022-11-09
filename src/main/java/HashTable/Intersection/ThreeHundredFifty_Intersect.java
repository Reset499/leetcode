package HashTable.Intersection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeHundredFifty_Intersect {
    public static void main(String[] args) {

    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i : nums1) {
            if (map.containsKey(i)) map.put(i, map.get(i) + 1);
            else map.put(i, 1);
        }
        for (int i : nums2) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) - 1);
                if (map.get(i) == 0) map.remove(i);
                result.add(i);
            }
        }
        return result.stream().mapToInt(x -> x).toArray();
    }
}
