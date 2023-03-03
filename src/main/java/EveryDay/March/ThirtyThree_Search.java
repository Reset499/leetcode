package EveryDay.March;

import javax.sound.midi.Soundbank;

public class ThirtyThree_Search {
    public static void main(String[] args) {
    }

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            if (target<nums[mid]){
                if(target<nums[left]&&nums[mid]>=nums[left]) left = mid+1;
                else right = mid-1;
            }
            else{
                if(nums[mid]<=nums[right]&&target>nums[right]) right = mid-1;
                else left = mid+1;
            }
        }
        return -1;
    }
}
