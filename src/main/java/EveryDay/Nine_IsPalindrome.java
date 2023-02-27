package EveryDay;

public class Nine_IsPalindrome {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int left = 0,right = s.length();
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;right--;
        }
        return true;
    }
}
