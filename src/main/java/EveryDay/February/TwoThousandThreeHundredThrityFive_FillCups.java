package EveryDay.February;

import java.util.Arrays;

public class TwoThousandThreeHundredThrityFive_FillCups {
    public static void main(String[] args) {
    }

    //    public static int fillCups(int[] amount) {
//        int result = 0;
//        while (true) {
//            Arrays.sort(amount);
//            if (amount[2] == 0) return result;
//            if (amount[1] != 0) amount[1]--;
//            amount[2]--;
//            result++;
//        }
//    }
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        if (amount[2] >= amount[1] + amount[0]) {
            return amount[2];
        }
        return (amount[0] + amount[1] + amount[2] + 1) / 2;
    }
}
