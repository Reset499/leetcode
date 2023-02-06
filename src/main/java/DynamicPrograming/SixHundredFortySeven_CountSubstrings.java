package DynamicPrograming;

public class SixHundredFortySeven_CountSubstrings {
    public static void main(String[] args) {

    }
    public int countSubstrings(String s) {
        boolean dp[][] = new boolean[s.length()][s.length()];
        int result = 0;
        for(int i = s.length()-1;i>=0;i--){
            for(int j = i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(i==j||i==j-1) dp[i][j] = true;
                    else if(j-1>i) dp[i][j] = dp[i+1][j-1]?true:false;
                }
                else dp[i][j] =false;
                if(dp[i][j]==true)result++;
            }
        }
        return result;
    }
}
