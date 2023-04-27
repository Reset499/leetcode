package EveryDay.April;

public class FiftyEight_LengthOfLastWord {
    public static void main(String[] args) {

    }

    public int lengthOfLastWord(String s) {
        int count = 0;
        boolean flag = false;
        for (int i = s.length() - 1; i >= 0; i++) {
            if (s.charAt(i) != ' ') {
                flag = true;
                count++;
            }else if(flag) return count;
        }
        return count;
    }
}
