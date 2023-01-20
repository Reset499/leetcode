package Greedy;

import java.util.LinkedList;
import java.util.List;

public class SevenHundredThree_PartitionLabels {
    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij").toString());
    }

    public static List<Integer> partitionLabels(String s) {
        List<Integer> result = new LinkedList<>();
        int[] edge = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) edge[chars[i] - 'a'] = i;
        int max = 0,count = 0;
        for (int i = 0; i < chars.length; i++) {
            max = Math.max(max,edge[chars[i]-'a']);
            count++;
            if (i == max) {
                result.add(count);
                count = 0;
                max = 0;
            }
        }
        return result;
    }
}
