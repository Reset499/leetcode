package EveryDay.March;

import java.util.*;

public class ThirtySix_isValidSudoku {
    public static void main(String[] args) {

    }

    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][][] squ = new int[3][3][9];
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                if(board[i][j] == '.') continue;
                if(row[i][board[i][j]-'1']!=0||col[j][board[i][j]-'1']!=0||squ[i/3][j/3][board[i][j]-'1']!=0)
                    return false;
                else {
                    row[i][board[i][j]-'1'] = 1;
                    col[j][board[i][j]-'1'] = 1;
                    squ[i/3][j/3][board[i][j]-'1'] = 1;
                }
            }
        }
        return true;
    }
}
