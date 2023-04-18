package EveryDay.April;

public class OneThousandFortyThree_MaxSumAfterPartitioning {
    public static void main(String[] args) {

    }

    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n + 1];
        dp[1] = arr[0];
        for (int i = 2; i < dp.length; i++) {
            int max = arr[i - 1];
            for (int j = i - 1; j >= 0 && j >= i - k; j--) {
                max = Math.max(max,arr[j]);
                dp[i] = Math.max(dp[i],dp[j]+max*(i-j));
            }
        }
        return dp[n];
    }
}
