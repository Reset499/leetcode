package EveryDay.June;

import java.util.Arrays;

public class EightyEight_Merge {
    public static void main(String[] args) {

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m+n];
        int index = 0;
        int index1 = 0,index2 = 0;
        while (index1<m&&index2<n){
            if(nums1[index1]<=nums2[index2]){
                result[index] = nums1[index1];
                index1++;
            }else {
                result[index] = nums2[index2];
                index2++;
            }
            index++;
        }
        if(index1<m){
            for(int i = index1;i<m;i++) result[index++] = nums1[i];
        }else {
            for(int i = index2;i<n;i++) result[index++] = nums2[i];
        }
        for(int i = 0;i< result.length;i++) nums1[i] = result[i];
    }
}
