import java.util.*;
class Result
{
    static int helper(int d, int k, int[] dp){
        if(d == 0) return 1;
        if(d < 0) return 0;
        if(dp[d] != -1) return dp[d];
        dp[d]= 0;
        
        for(int steps= 1; steps <= k; steps++){
            dp[d] += helper(d-steps, k, dp);
        }
        
        return dp[d];
    }
    
  static int totalWaysToDistance(int d, int k){
      int[] dp= new int[d+1];
      Arrays.fill(dp, -1);
      return helper(d, k, dp);
  }
}