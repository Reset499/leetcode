package DynamicPrograming;

public class bagsComplete {
    public static void main(String[] args) {

    }
    public int bagsComplete(int[] weight,int[] value,int bagSize){
        int[] dp = new int[bagSize+1];
        for(int i = 0;i<weight.length;i++){
            for(int j = weight[i];j<=bagSize;j++)
                dp[j] = Math.max(dp[j],dp[j-weight[i]]+value[i]);
        }
        return dp[bagSize];
    }
}
