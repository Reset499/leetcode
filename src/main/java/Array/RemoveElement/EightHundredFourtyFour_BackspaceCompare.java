package Array.RemoveElement;

public class EightHundredFourtyFour_BackspaceCompare {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));
    }

    public static boolean backspaceCompare(String s, String t) {
        //从后往前遍历
        int i = s.length() - 1, j = t.length() - 1;
        int skipS = 0, skipT = 0;
        while (i >= 0 || j >= 0) {
            //找到string s序列中下一个该比较的数的位置i
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    skipS++;
                    i--;
                } else if (skipS > 0) {
                    i--;
                    skipS--;
                } else break;
            }
            //找到string t序列中下一个该比较数的位置j
            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    j--;
                    skipT++;
                } else if (skipT > 0) {
                    j--;
                    skipT--;
                } else break;
            }
            //当i和j都没到边界时
            if (i >= 0 && j >= 0) {
                //比较s中的位置i与t中位置j的字母是否一致,不一致则直接返回false
                if (s.charAt(i) != t.charAt(j)) return false;
            }
            //如果两个其中有一个到了边界,但另一个还没有到达边界,则return false;
            else if (j >= 0 || i >= 0) return false;
            i--;
            j--;
        }
        return true;
    }
}
