package DynamicPrograming;

public class Seventy_ClimbStairs {
    public static void main(String[] args) {

    }

    public int climbStairs(int n) {
//        if (n < 2) return 1;
//        int[] dp = new int[n + 1];
//        dp[0] = 1;
//        dp[1] = 1;
//        for (int i = 2; i < n + 1; i++) dp[i] = dp[i-1]+dp[i-2];
//        return dp[n];
        int[] dp = new int[n + 1];
        int[] weight = {1, 2};
        dp[0] = 1;
        for (int j = 0; j <= n; j++) {
            for (int i = 0; i < 2; i++) {
                if(j>=weight[i]) dp[j]+=dp[j-weight[i]];
            }
        }
        return dp[n];
    }
}
