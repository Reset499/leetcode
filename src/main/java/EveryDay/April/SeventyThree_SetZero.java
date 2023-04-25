package EveryDay.April;

public class SeventyThree_SetZero {
    public static void main(String[] args) {
        setZeroes(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}});
    }

    public static void setZeroes(int[][] matrix) {
//        int m = matrix.length;
//        int n = matrix[0].length;
//        boolean[] row = new boolean[m];
//        boolean[] col = new boolean[n];
//        for(int i = 0;i<m;i++){
//            for(int j = 0;j<n;j++){
//                if(matrix[i][j]==0){
//                    row[i] = true;
//                    col[j] = true;
//                }
//            }
//        }
//        for(int i = 0;i<m;i++){
//            if(row[i]){
//                for(int j = 0;j<n;j++) matrix[i][j] = 0;
//            }
//        }
//        for(int i = 0;i<n;i++){
//            if(col[i]){
//                for(int j = 0;j<m;j++) matrix[j][i] = 0;
//            }
//        }
        int m = matrix.length;
        int n = matrix[0].length;
        boolean row0 = false, col0 = false;
        for (int i = 0; i < n; i++) {
            if (matrix[0][i] == 0) {
                row0 = true;
                break;
            }
        }
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                col0 = true;
                break;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            if (matrix[0][i] == 0) {
                for (int j = 0; j < m; j++) matrix[j][i] = 0;
            }
        }
        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < n; j++) matrix[i][j] = 0;
            }
        }
        if (row0) {
            for (int i = 0; i < n; i++) matrix[0][i] = 0;
        }
        if (col0) {
            for (int i = 0; i < m; i++) matrix[i][0] = 0;
        }
    }
}
