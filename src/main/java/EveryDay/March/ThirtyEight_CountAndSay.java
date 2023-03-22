package EveryDay.March;

public class ThirtyEight_CountAndSay {
    public static void main(String[] args) {

    }
    public  String countAndSay(int n) {
        if(n == 1) return "1";
        String s = countAndSay(n-1);
        int count = 0;//count来计数,记当前数字已经连续出现了多少次
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            count++;
            //若下一个数字已经不一样了,或者已经到最后了的话,则进行清算
            if(i==s.length()-1||s.charAt(i+1)!=s.charAt(i)){
                stringBuilder.append(count).append(s.charAt(i));
                count = 0;
            }
        }
        return stringBuilder.toString();
    }
}
