package EveryDay;

public class Seven_Reverse {
    public static void main(String[] args) {

    }
    public int reverse(int x) {
        long result = 0;
        boolean flag = x>0?true:false;
        while(x!=0){
            result = result*10+x%10;
            x = x/10;
        }
        if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE) return 0;
        return (int)result;
    }
}
