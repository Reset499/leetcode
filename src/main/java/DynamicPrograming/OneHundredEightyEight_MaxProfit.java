package DynamicPrograming;

public class OneHundredEightyEight_MaxProfit {
    public static void main(String[] args) {

    }

    public int maxProfit(int k, int[] prices) {
        int length = prices.length;
        if (length == 0) return 0;
        int[][] dp = new int[length][k * 2 + 1];
        for (int i = 0; i < k; i++) dp[0][i * 2 + 1] = -prices[0];
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < k; j++) {
                dp[i][2*j+1] = Math.max(dp[i-1][2*j+1],dp[i-1][2*j]-prices[i]);
                dp[i][2*j+2] = Math.max(dp[i-1][2*j+2],dp[i-1][2*j+1]+prices[i]);
            }
        }
        return dp[length-1][2*k];
    }
}
