package EveryDay.June;

import java.awt.geom.FlatteningPathIterator;
import java.net.http.HttpResponse;

public class SeventyNine_Exist {
    public static void main(String[] args) {
        System.out.println(exist(new char[][]{{'a', 'b'}, {'c', 'd'}}, "bacd"));
    }

    static boolean flag = false;

    public static boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        int[][] visited = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (flag) return flag;
                visited[i][j] = 1;
                bfs(board, i, j, word, 0, visited);
                visited[i][j] = 0;
            }
        }
        return flag;
    }

    public static void bfs(char[][] board, int m, int n, String word, int index, int[][] visited) {
        if (board[m][n] != word.charAt(index)) return;
        if (index == word.length() - 1) {
            flag = true;
            return;
        }
        if (!flag && m > 0&&visited[m-1][n]==0) {
            visited[m - 1][n] = 1;
            bfs(board, m - 1, n, word, index + 1, visited);
            visited[m - 1][n] = 0;
        }
        if (!flag && m < board.length - 1&&visited[m+1][n]==0) {
            visited[m + 1][n] = 1;
            bfs(board, m + 1, n, word, index + 1, visited);
            visited[m + 1][n] = 0;
        }
        if (!flag && n > 0&&visited[m][n-1]==0) {
            visited[m][n - 1] = 1;
            bfs(board, m, n - 1, word, index + 1, visited);
            visited[m][n - 1] = 0;
        }
        if (!flag && n < board[0].length - 1&&visited[m][n+1]==0) {
            visited[m][n+1] = 1;
            bfs(board, m, n + 1, word, index + 1,visited);
            visited[m][n+1] = 0;
        }
    }
}
