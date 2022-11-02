package Array.GenerateMatrix;

public class FiftyNine_generateMatrix {
    public static void main(String[] args) {
        generateMatrix(3);
    }

    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int start = 0, count = 1;
        int i, j;
        while (start < n / 2) {
            for (j = start; j < n - start - 1; j++)
                result[start][j] = count++;
            for (i = start; i < n - start - 1; i++)
                result[i][j] = count++;
            for (; j > start; j--)
                result[i][j] = count++;
            for (; i > start; i--)
                result[i][j] = count++;
            start++;
        }
        if (n % 2 == 1) result[start][start] = count;
        return result;
    }
}
