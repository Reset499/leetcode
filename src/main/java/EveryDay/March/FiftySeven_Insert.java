package EveryDay.March;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiftySeven_Insert {
    public static void main(String[] args) {
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int left = newInterval[0],right = newInterval[1];
        List<int[]> result = new ArrayList<>();
        boolean placed = false;
        for(int[] interval:intervals){
            if(interval[0]>right){//当前interval的最小值都比要插入的最大值都大,说明当前interval在插入区间的右侧,且无交集
                if(!placed){result.add(new int[]{left,right});placed = true;}//若已插入则跳过,未插入则插入
                result.add(interval);
            }else if(interval[1]<left) result.add(interval);//说明当前interval在插入区间的左侧,且无交集
            else {
                left = Math.min(left,interval[0]);
                right = Math.max(right,interval[1]);//有交集,并计算交集为新的插入区间
            }
        }
        if(!placed) result.add(new int[]{left,right});
        return result.toArray(new int[result.size()][]);
    }
}
