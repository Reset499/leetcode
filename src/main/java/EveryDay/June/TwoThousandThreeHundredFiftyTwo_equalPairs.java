package EveryDay.June;

import java.util.HashMap;
import java.util.Map;

public class TwoThousandThreeHundredFiftyTwo_equalPairs {
    public static void main(String[] args) {

    }

    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int result = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < n; j++) {
                stringBuilder.append("-" + grid[i][j]);
            }
            String tmp = stringBuilder.toString();
            map.put(tmp,map.getOrDefault(tmp,0)+1);
        }
        for(int j = 0;j<n;j++){
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0;i<n;i++) stringBuilder.append("-"+grid[i][j]);
            String tmp = stringBuilder.toString();
            result += map.containsKey(tmp)?map.get(tmp):0;
        }
        return result;
    }
}
