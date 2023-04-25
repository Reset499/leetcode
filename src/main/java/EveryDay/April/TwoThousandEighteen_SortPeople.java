package EveryDay.April;

import java.util.*;

public class TwoThousandEighteen_SortPeople {
    public static void main(String[] args) {
    }

    public String[] sortPeople(String[] names, int[] heights) {
//        int n = names.length;
//        String[] result = new String[n];
//        Map<Integer,String> map = new HashMap<>();
//        for(int i = 0;i<n;i++) map.put(heights[i],names[i]);
//        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
//        list.sort((o1, o2) -> o2.getKey().compareTo(o1.getKey()));
//        int i = 0;
//        for(Map.Entry<Integer,String> entry:list) result[i++] = entry.getValue();
//        return result;
        int n = names.length;
        Integer indices[] = new Integer[n];
        for (int i = 0; i < n; i++) indices[i] = i;
        Arrays.sort(indices,(a, b) -> heights[b] - heights[a]);
        String[] result = new String[n];
        for(int i = 0;i<n;i++){
            result[i] = names[indices[i]];
        }
        return result;
    }
}
