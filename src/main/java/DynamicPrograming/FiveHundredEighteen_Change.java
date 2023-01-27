package DynamicPrograming;

import javax.sound.midi.Soundbank;
import java.lang.reflect.AnnotatedArrayType;

public class FiveHundredEighteen_Change {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        System.out.println(change(5,coins));
    }
    public static int change(int amount, int[] coins) {
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for(int i  = 0;i<coins.length;i++){
            for(int j = coins[i];j<= amount;j++)
                dp[j] += dp[j-coins[i]];
        }
        return dp[amount];
    }
}
