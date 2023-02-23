package EveryDay;

public class Five_LongestPalindrome {
    public static void main(String[] args) {
    }

    public String longestPalindrome(String s) {
        int n = s.length(), max = 1;
        if (n == 1) return s;
        int[][] dp = new int[n][n];
        String result = s.substring(0,1);
        for (int i = 0; i < n; i++) dp[i][i] = 1;
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)&&dp[i+1][j-1]==j-i-1) {
                    if (i + 1 <= j - 1) dp[i][j] = dp[i + 1][j - 1] + 2;
                    else dp[i][j] = 2;
                } else dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                result = dp[i][j] > max ? s.substring(i, j + 1) : result;
                max = dp[i][j] > max ? dp[i][j] : max;
            }
        }
        return result;
    }

}
