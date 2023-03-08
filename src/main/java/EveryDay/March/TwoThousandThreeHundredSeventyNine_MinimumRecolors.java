package EveryDay.March;

public class TwoThousandThreeHundredSeventyNine_MinimumRecolors {
    public static void main(String[] args) {
        System.out.println(minimumRecolors("WBWBBWWBBWWWBWBBBWBWWBWWBWBWWWWBBB", 2));
    }

    public static int minimumRecolors(String blocks, int k) {
        int left = 0, count = 0, result = Integer.MAX_VALUE;
        for (int right = 0; right < blocks.length(); right++) {
            if (blocks.charAt(right) == 'W') count++;
            if (right - left == k - 1) {
                result = Math.min(result, count);
                while (blocks.charAt(left) != 'W' && left < right) left++;
                if (blocks.charAt(left) == 'W') count--;
                left++;
            }
        }
        return result;
    }
}
