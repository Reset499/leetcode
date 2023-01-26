package DynamicPrograming;

import javax.sound.midi.Soundbank;

public class OneThousandFortyNine_LastStoneWeightII {
    public static void main(String[] args) {

    }

    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int i = 0; i < stones.length; i++) sum += stones[i];
        boolean flag = sum % 2 == 0 ? false : true;
        int bagSize = sum/2;
        int[] dp = new int[bagSize+1];
        for(int i = 0;i<stones.length;i++){
            for(int j = bagSize;j>=stones[i];j--){
                dp[j] = Math.max(dp[j],dp[j-stones[i]]+stones[i]);
            }
        }
        return flag?(bagSize-dp[bagSize])*2+1:(bagSize-dp[bagSize])*2;
    }
}
