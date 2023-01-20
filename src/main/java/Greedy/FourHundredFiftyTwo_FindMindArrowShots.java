package Greedy;

import java.util.Arrays;

public class FourHundredFiftyTwo_FindMindArrowShots {
    public static void main(String[] args) {
    }

    public int findMinArrowShots(int[][] points) {
        if (points.length <= 1) return points.length;
        Arrays.sort(points, (a, b) -> Integer.compare(a[1] , b[1]));
        int result = 1,arrowAltitude = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (arrowAltitude < points[i][0]){
                result++;
                arrowAltitude = points[i][1];
            }
        }
        return result;
    }
}
