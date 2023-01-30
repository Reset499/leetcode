package DynamicPrograming;

public class SevenHundredEighteen_FindLength {
    public static void main(String[] args) {

    }

    public int findLength(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length+1][nums2.length+1];
        int result = 0;
        for (int i = 1; i < nums1.length+1; i++) {
            for (int j = 1; j < nums2.length+1; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    result = dp[i][j]>result?dp[i][j]:result;
                }
            }
        }
        return result;
    }

}
