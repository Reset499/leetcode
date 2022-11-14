package String;

public class FourHundredFiftyNine_RepeatedSubstringPattern {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abab"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        if (length == 0) return false;
        char[] chars = s.toCharArray();
        int[] next = new int[length];
        next[0] = -1;
        for (int i = 1, j = -1; i < length; i++) {
            while (j >= 0 && chars[i] != chars[j + 1]) j = next[j];
            if (chars[i] == chars[j+1]) j++;
            next[i] = j;
        }
        if (next[length-1] >= 0 && length % (length - next[length - 1] - 1) == 0) return true;
        return false;
    }
}
