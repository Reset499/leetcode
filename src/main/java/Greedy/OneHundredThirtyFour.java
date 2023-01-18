package Greedy;

import java.util.Arrays;

public class OneHundredThirtyFour {
    public static void main(String[] args) {

    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int remainGas = 0, totalGas = 0, result = 0;
        for (int i = 0; i < gas.length; i++) {
            remainGas += gas[i] - cost[i];
            totalGas += gas[i] - cost[i];
            if (remainGas < 0) {
                result = i + 1;
                remainGas = 0;
            }
        }
        if (totalGas < 0) return -1;
        return result;
    }
}
