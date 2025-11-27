class Solution {
    public int helper(int [] nums, int ind, int[] dp){
        if(ind >= nums.length - 1) return 0;
        if(nums[ind] == 0) return (int)1e6;
        if(dp[ind] != -1) return dp[ind];

        int mini= Integer.MAX_VALUE;
        for(int i=1; i<= nums[ind]; i++){
            int ans= helper(nums, ind+i, dp) + 1;
            mini= Math.min(mini, ans);
        }

        return dp[ind]= mini;
    }

    public int jump(int[] nums) {
        int[] dp= new int[nums.length];
        Arrays.fill(dp, -1);
        return helper(nums, 0, dp);
    }
}

// greedy

class Solution {
    public int jump(int[] nums) {
        int n= nums.length;
        int l=0; 
        int r=0;
        int jumps= 0;

        while(r< n-1){
            int farthest= 0;
            for(int i=l; i<=r ; i++){
                farthest= Math.max(i+ nums[i], farthest);
            }

            if(farthest > r){
                l= r+1;
                r= farthest;
                jumps++;
            }
        }

        return jumps;
    }
}