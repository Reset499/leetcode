package HashTable.Intersection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeHundredFortyNine_Intersection {
    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        List<Integer> result= new ArrayList<Integer>;
        for (int i = 0; i < nums1.length; i++) {
            if (map.get(nums1[i]) == true) continue;
            map.put(nums1[i], true);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i])) result.add(nums2[i]);
        }

        return result.toArray();
    }
}
