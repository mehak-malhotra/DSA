class Solution {
    // public int helper(List<List<Integer>> tri, int i, int j, int[][] dp){
    //     if(dp[i][j] != -1 ) return dp[i][j];

    //     if(i == 0 && j == 0) return tri.get(0).get(0);
    //     if(j == 0) return dp[i][j]= tri.get(i).get(0) + helper(tri, i-1, 0, dp);
    //     if(j == tri.get(i).size() - 1) return dp[i][j]= tri.get(i).get(j) + helper(tri, i-1, j-1, dp);

    //     int left= helper(tri, i-1, j-1, dp);
    //     int right= helper(tri, i-1, j, dp);

    //     return dp[i][j] = tri.get(i).get(j) + Math.min(left, right);
    // }

    // public int minimumTotal(List<List<Integer>> triangle) {
    //     int mini= Integer.MAX_VALUE;
    //     int rows= triangle.size();
    //     int cols= triangle.get(rows-1).size();

    //     int[][] dp= new int[rows][cols];
    //     for(int i=0; i<rows; i++) Arrays.fill(dp[i], -1);

    //     for(int i=0; i<cols; i++){
    //         mini= Math.min(mini, helper(triangle, rows-1, i, dp));
    //     }

    //     return mini;
    // }

    public int minimumTotal(List<List<Integer>> triangle){
        int rows= triangle.size();
        int cols= triangle.get(rows-1).size();
        int[][] dp= new int[rows][cols];

        int mini= Integer.MAX_VALUE;
        dp[0][0]= triangle.get(0).get(0);

        for(int i=1; i<rows; i++){
            for(int j=0; j<triangle.get(i).size(); j++){
                if(j == 0){
                    dp[i][0] = dp[i-1][0] + triangle.get(i).get(0);
                }else if(j == triangle.get(i).size() - 1){
                    dp[i][j] = dp[i-1][j - 1] + triangle.get(i).get(j);
                }else{
                    int left= dp[i-1][j-1];
                    int right= dp[i-1][j];
                    dp[i][j] = Math.min(left, right) + triangle.get(i).get(j);
                }
            }
        }

        for(int i=0; i<cols; i++){
            mini= Math.min(dp[rows-1][i], mini);
        }

        return mini;
    }
}