package DynamicPrograming;

public class SevenHundredFourteen_MaxProfit {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices, int fee) {
        if(prices==null||prices.length==0) return 0;
        int[][] dp = new int[prices.length][2];
        dp[0][0] = -prices[0]-fee;
        dp[0][1] = 0;
        for(int i = 1;i<prices.length;i++){
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]-prices[i]-fee);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]+prices[i]);
        }
        return dp[prices.length-1][1];
    }
}
