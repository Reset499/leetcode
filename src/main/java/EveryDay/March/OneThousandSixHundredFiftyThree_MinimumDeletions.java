package EveryDay.March;

public class OneThousandSixHundredFiftyThree_MinimumDeletions {
    public static void main(String[] args) {
    }

    public int minimumDeletions(String s) {
        int result = 0, count = 0;
        for (char c : s.toCharArray())
            if (c == 'b') count++; // f 值不变
            else result = Math.min(result + 1, count);
        return result;
    }
}
