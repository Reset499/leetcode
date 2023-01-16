package Greedy;

import java.util.Arrays;

public class FourHundredFiftyFive_FindContentChildren {
    public static void main(String[] args) {

    }

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0,start = s.length-1;
        for (int i = g.length - 1; i >= 0; i--) {
            if(start>=0&&s[start]>=g[i]){
                start--;
                result++;
            }
        }
        return result;
    }
}
