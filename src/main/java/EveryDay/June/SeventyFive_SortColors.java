package EveryDay.June;

public class SeventyFive_SortColors {
    public static void main(String[] args) {

    }

    public void sortColors(int[] nums) {
        int index = 0, left = 0, right = nums.length - 1;
        while (index<=right){
            if(nums[index]==0){
                swap(nums,index,left);
                left++;
                index++;
            }else if(nums[index]==2){
                swap(nums,index,right);
                right--;
            }else index++;
        }
    }
    public void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
