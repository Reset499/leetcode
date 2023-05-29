package EveryDay.May;

public class SeventyFour_SearchMatrix {
    public static void main(String[] args) {

    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right = m*n-1;
        while (left<right){
            int mid = (left+right)/2;
            int temp = matrix[mid/m][mid-mid/m*m];
            if(temp==target) return true;
            else if(temp>target) right = mid-1;
            else left = mid+1;
        }
        return false;
    }
}
