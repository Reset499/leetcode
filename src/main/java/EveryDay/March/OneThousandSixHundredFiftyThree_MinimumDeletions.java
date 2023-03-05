package EveryDay.March;

public class OneThousandSixHundredFiftyThree_MinimumDeletions {
    public static void main(String[] args) {
    }

    public int minimumDeletions(String s) {
//        int result = 0, count = 0;
//        for (char c : s.toCharArray())
//            if (c == 'b') count++; // f 值不变
//            else result = Math.min(result + 1, count);
//        return result;
        int[] dp = new int[s.length()];
        int count = s.charAt(0) == 'b' ? 1 : 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                count++;
                dp[i] = dp[i - 1];
            } else dp[i] = Math.min(count, dp[i - 1] + 1);
        }
        return dp[s.length() - 1];
    }
}
