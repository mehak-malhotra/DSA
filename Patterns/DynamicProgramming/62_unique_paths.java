class Solution {
    // public int helper(int m, int n, int i, int j, int[][] dp){
    //     if(i< 0 || j< 0) return 0;
    //     if(i == 0 && j == 0) return 1;
    //     if(dp[i][j] != -1) return dp[i][j];

    //     int up= helper(m, n, i-1, j, dp);
    //     int left= helper(m, n, i, j-1, dp);
    //     return dp[i][j]= up + left;
    // }

    // public int uniquePaths(int m, int n) {
    //     int[][] dp= new int[m][n];
    //     for(int i=0; i<m; i++) Arrays.fill(dp[i], -1);

    //     return helper(m, n, m-1, n-1, dp);
    // }
    
    public int uniquePaths(int m, int n){
        int[][] dp= new int[m][n];
        dp[0][0]= 1;

        for(int i=1; i<n; i++) dp[0][i]= 1;
        for(int i=1; i<m; i++) dp[i][0]= 1;

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                dp[i][j]= dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }
}