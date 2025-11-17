// with tabulation

class Solution {
    public int helper(int[] dp, int[] cost){
        int n= cost.length;
        dp[n-1]= cost[n-1];
        dp[n-2]= cost[n-2];

        for(int i=n-3; i>=0; i--){
            dp[i]= cost[i]+ Math.min(dp[i+1], dp[i+2]);
        }

        return Math.min(dp[0], dp[1]);
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] dp= new int[cost.length];
        return helper(dp, cost);
    }
}

// space optimised
class Solution {

    public int minCostClimbingStairs(int[] cost) {
        int n= cost.length;
        int prev1= cost[n-1];
        int prev2= cost[n-2];
        int temp= 0;

        for(int i=n-3; i>=0; i--){
            temp= prev1;
            prev1= prev2;
            prev2= cost[i] + Math.min(prev1, temp);
        }

        return Math.min(prev1, prev2);
    }
}