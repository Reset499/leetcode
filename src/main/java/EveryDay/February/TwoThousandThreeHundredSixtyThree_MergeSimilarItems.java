package EveryDay.February;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class TwoThousandThreeHundredSixtyThree_MergeSimilarItems {
    public static void main(String[] args) {
    }

    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < items1.length; i++) map.put(items1[i][0], map.getOrDefault(items1[i][0], 0) + items1[i][1]);
        for (int i = 0; i < items2.length; i++) map.put(items2[i][0], map.getOrDefault(items2[i][0], 0) + items2[i][1]);
        Set<Integer> set = map.keySet();
//        TreeSet<Integer> treeSet = new TreeSet<>(((a,b)->a-b));
//        treeSet.addAll(set);
        for(Integer integer:set){
            List<Integer> list = new ArrayList<>();
            list.add(integer);
            list.add(map.get(integer));
            result.add(list);
        }
        Collections.sort(result,(a,b)->a.get(0)-b.get(0));
        return result;
    }
}
