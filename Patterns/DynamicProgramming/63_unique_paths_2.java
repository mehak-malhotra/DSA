class Solution {
    public int helper(int m, int n, int i, int j, int[][] dp, int[][] obs){
        if(i< 0 || j< 0) return 0;
        if(obs[i][j] == 1) return dp[i][j] = 0;
        if(i == 0 && j == 0) return 1;
        if(dp[i][j] != -1) return dp[i][j];

        int up= helper(m, n, i-1, j, dp, obs);
        int left= helper(m, n, i, j-1, dp, obs);
        return dp[i][j]= up + left;
    }

    public int uniquePathsWithObstacles(int[][] obs) {
        if (obs[0][0] == 1) return 0;
        int m= obs.length;
        int n= obs[0].length;

        int[][] dp= new int[m][n];
        for(int i=0; i<m; i++) Arrays.fill(dp[i], -1);

        return helper(m, n, m-1, n-1, dp, obs);
    }
}