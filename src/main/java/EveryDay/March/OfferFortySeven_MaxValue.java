package EveryDay.March;

import javax.sound.midi.Soundbank;

public class OfferFortySeven_MaxValue {
    public static void main(String[] args) {
    }

    public int maxValue(int[][] grid) {
        int rowLen = grid.length, colLen = grid[0].length;
        int[][] dp = new int[rowLen][colLen];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < colLen; i++) dp[0][i] = dp[0][i-1]+grid[0][i];
        for (int i = 1; i < rowLen; i++) dp[i][0] = dp[i-1][0]+grid[i][0];
        for (int i = 1; i < rowLen; i++) {
            for (int j = 1; j < colLen; j++)
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
        }
        return dp[rowLen-1][colLen-1];
    }
}
