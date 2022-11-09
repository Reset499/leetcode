package String;

public class FIveHundredFortyOne_ReverseStr {
    public static void main(String[] args) {
        System.out.println(reverseStr("hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl", 39));
    }

    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int left = 0, right = (left + k - 1) >= s.length() ? s.length() - 1 : (left + k - 1);
        while (left < s.length() && right < s.length()) {
            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            left = k % 2 == 0 ? left + k + k / 2 : left + k + k / 2 + 1;
            right = (left + k - 1) >= s.length() ? s.length() - 1 : (left + k - 1);
        }
        return new String(chars);
    }
}
