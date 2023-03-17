package EveryDay.March;

public class OneThousandSixHundredSixteen_CheckPalindromeFormation {
    public static void main(String[] args) {
    }


    public boolean checkConcatenation(String a, String b) {
        int n = a.length();
        int left = 0, right = n - 1;
        //判断从哪里开始就已经不相等了(不相等再继续下去 无论怎么拼也不可能是回文串),要进行拼接才有可能形成子字符串
        while (left < right && a.charAt(left) == b.charAt(right)) {
            left++;
            right--;
        }//若到中间俩都一样那肯定一拼接就是正确的
        if (left >= right) {
            return true;
        }
        //看看拼接后是否是回文串
        return checkSelfPalindrome(a, left, right) || checkSelfPalindrome(b, left, right);
    }

    public boolean checkSelfPalindrome(String a, int left, int right) {
        while (left < right && a.charAt(left) == a.charAt(right)) {
            left++;
            right--;
        }
        return left >= right;
    }
    public boolean isValid(String s){
        int left = 0,right = s.length()-1;
        while (left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
