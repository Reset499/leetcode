package DynamicPrograming;

public class bags01 {
    public static void main(String[] args) {
        int[] weight = {1, 3, 4};
        int[] value = {15, 20, 30};
        System.out.println(bags01(weight, value, 4));
    }

    public static int bags01(int[] weight, int[] value, int bagSize) {
        int m = weight.length;
        int n = bagSize;
        int[][] dp = new int[m][n + 1];
        for (int i = weight[0]; i < n + 1; i++) dp[0][i] = value[0];
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n + 1; j++) {
                if(j<weight[i]) dp[i][j] = dp[i-1][j];
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i]] + value[i]);
            }
        }
        return dp[m - 1][n];
    }
}
