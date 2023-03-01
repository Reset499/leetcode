package EveryDay.March;

import java.util.ArrayList;
import java.util.List;

public class TwentyTwo_GenerateParenthesis {
    public static void main(String[] args) {

    }


//    public static List<String> generateParenthesis(int n) {
//        int left = 0, right = 0;
//        StringBuilder stringBuilder = new StringBuilder();
//        backTracing(stringBuilder, left, right, n);
//        return result;
//    }

//    public static void backTracing(StringBuilder stringBuilder, int left, int right, int n) {
//        if (left == n) {
//            int curLen = stringBuilder.length();
//            for (int i = curLen; i < 2 * n; i++) stringBuilder.append(")");
//            result.add(stringBuilder.toString());
//            stringBuilder.delete(curLen, 2 * n);
//            return;
//        }
//        if (left == right) {
//            stringBuilder.append("(");
//            backTracing(stringBuilder, left + 1, right, n);
//            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
//        }
//        if(left>right) {
//            stringBuilder.append(")");
//            backTracing(stringBuilder, left, right + 1, n);
//            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
//        }


    // 做加法
    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        if (n == 0) return result;
        backTracing("", 0, 0, n);
        return result;
    }

    private void backTracing(String curStr, int left, int right, int n) {
        if (left == n && right == n) {
            result.add(curStr);
            return;
        }
        if (left < right) return;
        if (left < n) backTracing(curStr + "(", left + 1, right, n);
        if (right < n) backTracing(curStr + ")", left, right + 1, n);
    }


}
