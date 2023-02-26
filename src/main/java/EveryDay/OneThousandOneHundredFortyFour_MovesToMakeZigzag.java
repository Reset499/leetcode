package EveryDay;

public class OneThousandOneHundredFortyFour_MovesToMakeZigzag {
    public static void main(String[] args) {
        System.out.println(movesToMakeZigzag(new int[]{10,4,4,10,10,6,2,3}));
    }

    public static int movesToMakeZigzag(int[] nums) {
        int result = 0, result1 = 0, n = nums.length;
        if(n<=1) return 0;
        for (int i = 0; i < n; i += 2) {
            if(i==0) result+=nums[i+1]<=nums[i]?nums[i]-nums[i+1]+1:0;
            else if(i==n-1) result+=nums[i-1]<=nums[i]?nums[i]-nums[i-1]+1:0;
            else if(nums[i-1]<=nums[i]||nums[i+1]<=nums[i]) result+=Math.max(nums[i]-nums[i-1],nums[i]-nums[i+1])+1;
        }
        for (int i = 1; i < n; i += 2) {
            if(i==n-1) result1+=nums[i-1]<=nums[i]?nums[i]-nums[i-1]+1:0;
            else if(nums[i-1]<=nums[i]||nums[i+1]<=nums[i]) result1+=Math.max(nums[i]-nums[i-1],nums[i]-nums[i+1])+1;
        }
        return Math.min(result,result1);
    }
}
