package EveryDay.May;

public class TwoThousandFiftyFive {
    public static void main(String[] args) {

    }

    public int averageValue(int[] nums) {
        int sum = 0;
        int count = 1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%6==0){
                sum+=nums[i];
                count++;
            }
        }
        return count==0?0:(sum/count);
    }
}
