class Solution {
    public int helper(int s,  int ind, int[] nums, int[] dp){
        if(ind < s) return 0;
        if(dp[ind] != -1) return dp[ind];

        int choose = nums[ind] + helper(s, ind - 2, nums, dp);
        int notChoose = helper(s, ind - 1, nums, dp);
        return dp[ind]= Math.max(choose, notChoose);
    }

    public int rob(int[] nums) {
        // // memoisation

        // int n= nums.length;
        // if(n == 1) return nums[0];

        // int[] dp= new int[n];
        // Arrays.fill(dp, -1);

        // int nonLast= helper(0, n-2, nums, dp);
        // Arrays.fill(dp, -1);

        // int last= helper(1, n-1, nums, dp);
        // return Math.max(last, nonLast);

        // tabulation

        int n= nums.length;
        if(n == 1) return nums[0];

        int[] dp= new int[n];

        dp[0]= nums[0];
        dp[1]= Math.max(nums[0], nums[1]);

        for(int i=2; i<n-1; i++){
            int pick= dp[i-2] + nums[i];
            int notPick= dp[i-1];
            dp[i] = Math.max(pick, notPick);
        }

        int pick0= dp[n-2];
        dp[0]= 0;
        dp[1]= nums[1];
        
        for(int i=2; i<n; i++){
            int pick= dp[i-2] + nums[i];
            int notPick= dp[i-1];
            dp[i] = Math.max(pick, notPick);
        }

        int pick1= dp[n-1];
        return Math.max(pick0, pick1);
    }
}