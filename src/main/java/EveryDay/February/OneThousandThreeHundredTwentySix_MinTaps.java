package EveryDay.February;

import java.util.Arrays;

public class OneThousandThreeHundredTwentySix_MinTaps {
    public static void main(String[] args) {

    }

    public int minTaps(int n, int[] ranges) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        // dp[i] 表示为了覆盖区间 [0,i] 所需要 的最小taps 即前i个数为止的区间。
        dp[0] = 0;

        // 遍历所有水龙头的位置
        for (int i = 0; i <= n; i++){
            // 找到当前处的tap能覆盖的最左和最右的位置
            int left = Math.max(i- ranges[i], 0);
            int right = Math.min(i + ranges[i], n);
            for (int j = left + 1; j <= right;j++){
                //查看如果用这个tap去覆盖这些位置,所用的水龙头的位置均为前【0，left】区间所需要的水龙头的数量 + 1
                if (dp[left] != Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j], dp[left] + 1);
                }
            }
        }
        return dp[n] == Integer.MAX_VALUE ? -1: dp[n];
    }
}
