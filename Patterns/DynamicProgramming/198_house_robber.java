// with recursion + memoisation

class Solution {
    public int helper(int[] nums, int[] dp, int i){
        if(i >= nums.length) return 0;
        if(dp[i] != -1) return dp[i];
        int rob= nums[i] + helper(nums, dp, i+2);
        int skip= helper(nums, dp, i+1);
        return dp[i]= Math.max(rob, skip);
    }

    public int rob(int[] nums) {
        int[] dp= new int[nums.length];
        Arrays.fill(dp, -1);
        return helper(nums, dp, 0);
    }
}

// without using extra space
// space optimisation

class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);

        int n1= nums[n-1];
        int n2= Math.max(nums[n-1], nums[n-2]);

        for(int i= n-3; i>= 0; i--){
            int rob= nums[i]+ n1;
            int skip= n2;
            n1= skip;
            n2= Math.max(rob, skip);
        }

        return n2;
    }
}