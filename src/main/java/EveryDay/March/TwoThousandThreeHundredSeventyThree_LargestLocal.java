package EveryDay.March;

public class TwoThousandThreeHundredSeventyThree_LargestLocal {
    public static void main(String[] args) {
        System.out.println(largestLocal(new int[][]{{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}}));
    }

    public static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] result = new int[n - 2][n - 2];
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) result[i][j] = max(grid, i + 1, j + 1);
        }
        return result;
    }

    public static int max(int[][] grid, int i, int j) {
        int max = 0;
        for (int row = i - 1; row <= i + 1; row++) {
            for (int col = j - 1; col <= j + 1; col++) {
                max = Math.max(grid[row][col], max);
            }
        }
        return max;
    }
}
