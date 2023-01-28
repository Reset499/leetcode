package DynamicPrograming;

import javax.sound.midi.Soundbank;

public class TwoHundredSeventyNine_NumSquares {
    public static void main(String[] args) {

    }

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < dp.length; i++) dp[i] = max;
        dp[0] = 0;
        for (int i = 1; i * i <= n; i++) {
            for (int j = i * i; j <= n; j++) {
                if (dp[j - i * i] != max)
                    dp[j] = Math.min(dp[j], dp[j - i * i]+1);
            }
        }
        return dp[n];
    }
}
