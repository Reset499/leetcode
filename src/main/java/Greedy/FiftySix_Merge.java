package Greedy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FiftySix_Merge {
    public static void main(String[] args) {

    }

    public int[][] merge(int[][] intervals) {
        List<int[]> result = new LinkedList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int start = intervals[0][0], end = intervals[0][1];
        for (int i = 0; i < intervals.length; i++) {
            if (end >= intervals[i][0]) end = Math.max(intervals[i][1],end);
            else {
                result.add(new int[]{start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
            if(i==intervals.length-1) result.add(new int[]{start,end});
        }
        return result.toArray(new int[result.size()][]);
    }
}
