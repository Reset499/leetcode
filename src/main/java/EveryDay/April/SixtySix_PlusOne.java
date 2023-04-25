package EveryDay.April;

public class SixtySix_PlusOne {
    public static void main(String[] args) {

    }
    public int[] plusOne(int[] digits) {
        int n  = digits.length;
        boolean flag = true;
        for(int i = n-1;i>=0;i--){
            if(digits[i]==9&&flag) digits[i] = 0;
            else{
                digits[i]++;
                flag = false;
                break;
            }
        }
        if(flag){
            int[] result = new int[n+1];
            result[0] = 1;
            return result;
        }else return digits;
    }
}
