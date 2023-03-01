package EveryDay.March;

import java.util.ArrayList;
import java.util.List;

public class TwentyTwo_GenerateParenthesis {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }


    static List<String> result = new ArrayList<>();

    public static List<String> generateParenthesis(int n) {
        int left = 0, right = 0;
        String s = "";
        backTracing(s, left, right, n);
        return result;
    }

    public static void backTracing(String s, int left, int right, int n) {
        if (left == n) {
            int curLen = s.length();
            for (int i = curLen; i < 2 * n; i++) s+=")";
            result.add(s);
            return;
        }
        if(left<right) return;
        if (left < n) {
            backTracing(s+"(", left + 1, right, n);
        }
        if (right < n) {
            backTracing(s+")", left, right + 1, n);
        }
    }


//    // 做加法
//
//    public List<String> generateParenthesis(int n) {
//        if (n == 0) return result;
//        backTracing("", 0, 0, n);
//        return result;
//    }
//
//    private void backTracing(String curStr, int left, int right, int n) {
//        if (left == n && right == n) {
//            result.add(curStr);
//            return;
//        }
//        if (left < right) return;
//        if (left < n) backTracing(curStr + "(", left + 1, right, n);
//        if (right < n) backTracing(curStr + ")", left, right + 1, n);
//    }


}
