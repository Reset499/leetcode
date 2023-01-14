package BackTacking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Seventeen_LetterCombinations {
    public static void main(String[] args) {

    }

    List<String> result = new ArrayList<>();
    StringBuilder stringBuilder = new StringBuilder();
    String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) return result;
        backTracing(digits, 0);
        return result;
    }

    public void backTracing(String digits, int startIndex) {
        if (stringBuilder.length() == digits.length()) {
            result.add(stringBuilder.toString());
            return;
        }
        String str = numString[digits.charAt(startIndex) - '0'];
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(str.charAt(i));
            backTracing(digits, startIndex + 1);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }
}
