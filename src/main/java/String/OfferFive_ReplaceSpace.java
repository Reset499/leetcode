package String;

public class OfferFive_ReplaceSpace {
    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }

    public static String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == ' ') stringBuilder.append("  ");
        if (stringBuilder.length() == 0) return s;
        int left = s.length() - 1;
        s += stringBuilder;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (left >= 0) {
            if (chars[left] == ' ') {
                chars[right--] = '0';
                chars[right--] = '2';
                chars[right--] = '%';
                left--;
            } else
                chars[right--] = chars[left--];
        }
        return new String(chars);
    }
}
