package DynamicPrograming;

public class OneHundredTwentyTwo_MaxProfit2 {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
//        int result = 0;
//        for(int i = 0;i<prices.length-1;i++){
//            if(prices[i+1]-prices[i]>0) result+=prices[i+1]-prices[i];
//        }
//        return result;
        if (prices == null || prices.length == 0) return 0;
        int length = prices.length;
        int[][]dp=new int[length][2];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        for(int i = 1;i<length;i++){
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]-prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]+prices[i]);
        }
        return dp[length-1][1];
    }
}
