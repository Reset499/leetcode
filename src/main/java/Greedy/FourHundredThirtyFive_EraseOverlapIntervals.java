package Greedy;

import java.util.Arrays;

public class FourHundredThirtyFive_EraseOverlapIntervals {
    public static void main(String[] args) {

    }

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length <= 1) return 0;
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int result = 0, target = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < target) result++;
            else target = intervals[i][1];
        }
        return result;
    }
}
