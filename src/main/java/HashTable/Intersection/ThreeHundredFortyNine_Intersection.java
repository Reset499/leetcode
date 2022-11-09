package HashTable.Intersection;

import java.util.*;

public class ThreeHundredFortyNine_Intersection {
    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) return new int[0];
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> result = new HashSet<Integer>();
        for (int i : nums1) set.add(i);
        for (int i : nums2)
            if (set.contains(i)) result.add(i);
        return result.stream().mapToInt(x -> x).toArray();
    }
}
