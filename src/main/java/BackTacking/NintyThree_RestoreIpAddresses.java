package BackTacking;

import java.util.ArrayList;
import java.util.List;

public class NintyThree_RestoreIpAddresses {
    public static void main(String[] args) {

    }

    List<String> result = new ArrayList<>();
    StringBuilder stringBuilder = new StringBuilder();

    public List<String> restoreIpAddresses(String s) {
        if (s == null || s.length() < 4) return result;
        backTracing(s, 0, 0);
        return result;
    }

    public void backTracing(String s, int startIndex, int num) {
        if (startIndex >= s.length()&&num >=4) {
            result.add(stringBuilder.toString());
            return;
        }
        if (s.length() - startIndex > 3 * (4 - num)) return;
        for (int i = startIndex; i < startIndex + 3 && i < s.length(); i++) {
            int temp = Integer.parseInt(s.substring(startIndex, i + 1));
            String str = s.substring(startIndex, i + 1);
            if (temp > 255||(s.charAt(startIndex)=='0'&&str.length()>1)) return;
            if (stringBuilder.length() == 0) {
                stringBuilder.append(str);
                backTracing(s, i + 1, num + 1);
                stringBuilder.delete(0, stringBuilder.length());
            } else {
                stringBuilder.append("." + str);
                backTracing(s, i + 1, num + 1);
                stringBuilder.delete(stringBuilder.length() - 1 - str.length(), stringBuilder.length());
            }
        }
    }
}
