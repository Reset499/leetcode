package DynamicPrograming;

public class ThreeHundredFortyThree_IntegerBreak {
    public static void main(String[] args) {

    }

    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < i; j++)
                dp[i] = Math.max(dp[i], Math.max(dp[i-j]*j,(i-j)*j));
        }
        return dp[n];
    }
}
