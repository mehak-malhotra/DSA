class Solution {
    public int helper(int[][] grid, int i, int j, int[][] dp){
        if(i < 0 || j < 0) return Integer.MAX_VALUE;
        if(i == 0 && j == 0) return grid[0][0];
        if(dp[i][j] != -1) return dp[i][j];

        return dp[i][j]= grid[i][j] + Math.min(helper(grid, i-1, j, dp), helper(grid, i, j-1, dp));
    }
    public int minPathSum(int[][] grid) {
        int row= grid.length;
        int col= grid[0].length;
        int[][] dp= new int[row][col];
        for(int i=0; i<row; i++){
            Arrays.fill(dp[i], -1);
        }

        return helper(grid, row-1, col-1, dp);
    }
}

// using tabulation (bottom-up approach)

class Solution {
    public int minPathSum(int[][] grid) {
        int m= grid.length;
        int n= grid[0].length;

        int[][] dp= new int[m][n];

        dp[0][0] = grid[0][0];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i == 0 && j == 0){ 
                    dp[i][j]= grid[i][j];
                }else{
                    int up= i>0 ? dp[i-1][j]: Integer.MAX_VALUE;
                    int left= j>0 ? dp[i][j-1]:Integer.MAX_VALUE;
                    dp[i][j] = grid[i][j] + Math.min(left, up);
                }
            }
        }

        return dp[m-1][n-1];
    }
}

// space optimisation

class Result
{
  static int minCostPath(int cost[][], int m, int n){
      int[] prev= new int[n];
      prev[0]= cost[0][0];
      for(int i=1; i<n; i++){
          prev[i]= prev[i-1] + cost[0][i];
      }
      
      for(int i=1; i<m; i++){
          int[] curr= new int[n];
          for(int j=0; j<n; j++){
              if(j == 0){
                  curr[j]= prev[j] + cost[i][j];
              }else{
                  curr[j]= cost[i][j] + Math.min(prev[j], Math.min(prev[j-1], curr[j-1]));
              }
          }
          prev= curr.clone();
      }
      
      return prev[n-1];
  }
}