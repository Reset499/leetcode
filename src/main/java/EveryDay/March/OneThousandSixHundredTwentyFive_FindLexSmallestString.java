package EveryDay.March;

import java.util.*;

public class OneThousandSixHundredTwentyFive_FindLexSmallestString {
    public static void main(String[] args) {

    }
    public String findLexSmallestString(String s, int a, int b) {
        String ans = s;
        Queue<String> queue = new LinkedList<>();
        queue.add(s);
        Set<String> set = new HashSet<>();
        while (!queue.isEmpty()) {
            String cur = queue.poll();
            if (cur.compareTo(ans) < 0) {
                ans = cur;
            }
            cur = roll(cur, b);
            while (!set.contains(cur)) {
                set.add(cur);
                queue.add(cur);
                cur = add(cur, a);
            }
        }
        return ans;
    }

    private String add(String cur, int a) {
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < cur.length(); i++) {
            char c = cur.charAt(i);
            if ((i & 1) == 0) {
                ans.append(c);
            } else {
                int n = c - '0';
                n = (n + a) % 10;
                ans.append(n);
            }
        }
        return ans.toString();
    }

    private String roll(String cur, int b) {
        return cur.substring(cur.length() - b) + cur.substring(0, cur.length() - b);
    }
}
