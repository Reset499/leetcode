package EveryDay.May;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class OneThousandNintyOne_ShortestPathBInaryMatrix {
    public static void main(String[] args) {
        System.out.println(shortestPathBinaryMatrix(new int[][]{{0,0,0},{1,1,0},{1,1,0}}));
    }

    public static int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(n==1&&grid[0][0]==0) return 1;
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) return -1;
        Queue<int[]> queue = new LinkedList<>();
        Set<String> set = new HashSet<>();
        queue.offer(new int[]{0, 0});
        set.add("-0-0");
        int result = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                int i = queue.peek()[0];
                int j = queue.peek()[1];
                queue.poll();
                if((i==n-2&&j==n-1)||(i==n-2&&j==n-2)||(i==n-1&&j==n-2)) return result+1;
                //往左上角走i-1,j-1
                if ((i - 1 >= 0 && j - 1 >= 0) && !set.contains("-" + (i - 1) + "-" + (j - 1)) && grid[i - 1][j - 1] == 0) {
                    queue.add(new int[]{i - 1, j - 1});
                    set.add("-" + (i - 1) + "-" + (j - 1));
                }
                //往上方走i-1,j
                if (i - 1 >= 0 && !set.contains("-" + (i - 1) + "-" + j) && grid[i - 1][j] == 0) {
                    queue.add(new int[]{i - 1, j});
                    set.add("-" + (i - 1) + "-" + j);
                }
                //往右上角走i-1,j+1
                if ((i - 1 >= 0 && j + 1 <= n - 1) && !set.contains("-" + (i - 1) + "-" + (j + 1)) && grid[i - 1][j + 1] == 0) {
                    queue.add(new int[]{i - 1, j + 1});
                    set.add("-" + (i - 1) + "-" + (j + 1));
                }
                //往左边走i,j-1
                if (j-1 >= 0 && !set.contains("-" + i + "-" + (j - 1)) && grid[i][j - 1] == 0) {
                    queue.add(new int[]{i, j - 1});
                    set.add("-" + i + "-" + (j - 1));
                }
                //往右边走i,j+1
                if (j + 1 <= n - 1 && !set.contains("-" + i + "-" + (j + 1)) && grid[i][j + 1] == 0) {
                    queue.add(new int[]{i, j + 1});
                    set.add("-" + i + "-" + (j + 1));
                }
                //往左下角走i+1,j-1
                if ((i + 1 <= n - 1 && j - 1 >= 0) && !set.contains("-" + (i + 1) + "-" + (j - 1)) && grid[i + 1][j - 1] == 0) {
                    queue.add(new int[]{i + 1, j - 1});
                    set.add("-" + (i + 1) + "-" + (j - 1));
                }
                //往下边走i+1,j
                if (i + 1 <= n - 1 && !set.contains("-" + (i + 1) + "-" + j) && grid[i + 1][j] == 0) {
                    queue.add(new int[]{i + 1, j});
                    set.add("-" + (i + 1) + "-" + j);
                }
                //往右下边走i+1,j+1
                if ((i + 1 <= n - 1 && j + 1 <= n - 1) && !set.contains("-" + (i + 1) + "-" + (j + 1)) && grid[i + 1][j + 1] == 0) {
                    queue.add(new int[]{i + 1, j+1});
                    set.add("-" + (i + 1) + "-" + (j+1));
                }
            }
            result++;
        }
        return -1;
    }
}
