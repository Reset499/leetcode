package String;

import java.util.ArrayList;
import java.util.List;

public class OneHundredFiftyOne_ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords(" asdasd df f "));
    }

    public static String reverseWords(String s) {
        String result = "";
        List<String> strings = new ArrayList<>();
        boolean start = false;
        int i = 0, left = 0, right = 0, length = s.length();
        while (i < length) {
            if (start == false) {
                if (s.charAt(i) == ' ') {
                    i++;
                    continue;
                }
                start = true;
                left = i;
            } else {
                if (s.charAt(i) == ' ') {
                    right = i;
                    start = false;
                    strings.add(s.substring(left, right));
                }
            }
            if(i == length - 1&&start== true) strings.add(s.substring(left,length));
            i++;
        }
        for (int j = strings.size() - 1; j >= 0; j--) {
            if (j == strings.size() - 1) result += strings.get(j);
            else result += " " + strings.get(j);
        }
        return result;
    }
}
