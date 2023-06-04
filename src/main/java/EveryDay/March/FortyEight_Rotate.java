package EveryDay.March;


public class FortyEight_Rotate {
    public static void main(String[] args) {
        rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
    public static void rotate(int[][] matrix) {
        int n = matrix.length,level = n/2,temp = 0;
        for(int i = 0;i<level;i++){
            for(int j = i;j<n-1-i;j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-i-1][n-1-j];
                matrix[n-i-1][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i]  =temp;
            }
        }
    }
}
