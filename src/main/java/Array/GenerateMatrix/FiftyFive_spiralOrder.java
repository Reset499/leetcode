package Array.GenerateMatrix;

import java.util.ArrayList;
import java.util.List;

public class FiftyFive_spiralOrder {
    public static void main(String[] args) {
        int[][] matrix = {{2, 5}, {8, 4}, {0, 1}};
        spiralOrder(matrix);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int lineCount = matrix.length;
        int columnCount = matrix[0].length;
        int bound = 0;
        int column = 0, line = 0;
        while (column < columnCount / 2 && line < lineCount / 2) {
            for (; column < columnCount - bound - 1; column++)
                result.add(matrix[line][column]);
            for (; line < lineCount - bound - 1; line++) {
                result.add(matrix[line][column]);
            }
            for (; column > bound; column--) {
                result.add(matrix[line][column]);
            }
            for (; line > bound; line--) {
                result.add(matrix[line][column]);
            }
            line++;
            column++;
            bound++;
        }
        if (bound == (Math.min(lineCount,columnCount)+1)/2)
            return result;
        else {
            if (columnCount > lineCount) {
                for (int i = bound; i < columnCount - bound; i++)
                    result.add(matrix[lineCount / 2][i]);
            } else if (columnCount < lineCount) {
                for (int i = bound; i < lineCount - bound; i++)
                    result.add(matrix[i][columnCount / 2]);
            } else result.add(matrix[lineCount / 2][columnCount / 2]);
        }
        return result;
    }
}
