package BackTacking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class OneHundredThirtyOne_Partition {
    public static void main(String[] args) {

    }

    List<List<String>> result = new ArrayList<>();
    LinkedList<String> path = new LinkedList<>();

    public List<List<String>> partition(String s) {
        backTracing(s, 0);
        return result;
    }

    public void backTracing(String s, int startIndex) {
        if (startIndex >= s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            if(isPalindrome(s,startIndex,i)){
                String str = s.substring(startIndex,i+1);
                path.add(str);
            }else continue;
            backTracing(s,i+1);
            path.removeLast();
        }
    }

    public boolean isPalindrome(String s, int startIndex, int end) {
        for (int i = startIndex, j = end; i < j; i++, j--)
            if (s.charAt(i) != s.charAt(j)) return false;
        return true;
    }
}
