// User function Template for Java

class Solution {
    // with memoisation
    
    // int helper(int[] arr, int ind, int[] dp){
    //     // base case
    //     if(ind < 0){
    //         return 0;
    //     }
        
    //     // dp table
    //     if(dp[ind] != -1) return dp[ind];
        
    //     // pick
    //     int pick= arr[ind] + helper(arr, ind-2, dp);
        
    //     // not pick
    //     int notPick= helper(arr, ind-1, dp);
        
    //     return dp[ind]= Math.max(pick, notPick);
    // }
    
    // int findMaxSum(int arr[]) {
    //     int n= arr.length;
    //     if(n == 1) return arr[0];
        
    //     int[] dp= new int[n];
    //     Arrays.fill(dp, -1);
        
    //     return helper(arr, n - 1, dp);
    // }
    
    // with tabulation
    // int findMaxSum(int arr[]){
    //     int n= arr.length;
    //     int[] dp= new int[n];
        
    //     dp[0]= arr[0];
    //     if(n >1) dp[1]= Math.max(arr[0], arr[1]);
        
    //     for(int i=2; i<n; i++){
    //         int pick= arr[i] + dp[i-2];
    //         int notPick= dp[i-1];
            
    //         dp[i]= Math.max(pick, notPick);
    //     }
        
    //     return dp[n-1];
    // }
    
    // space optimisation
    int findMaxSum(int arr[]){
        int n= arr.length;
        int prev1= arr[0];
        if(n == 1) return prev1;
        
        int prev2= Math.max(arr[0], arr[1]);
        for(int i=2; i<n; i++){
            int pick= arr[i] + prev1;
            int notPick= prev2;
            prev1= prev2;
            prev2= Math.max(pick, notPick);
        }
        
        return prev2;
    }
}