package Greedy;

public class FortyFive_Jump {
    public static void main(String[] args) {

    }

    public int jump(int[] nums) {
        int result = 0, end = 0, temp = 0;
        for (int i = 0; i <= end && end < nums.length - 1; i++) {
            temp = Math.max(temp,i+nums[i]);
            if(i == end){
                end = temp;
                result++;
            }
        }
        return result;
    }
}
