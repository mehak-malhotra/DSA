// User function Template for Java
import java.util.*;

class Solution {
    // memoisation (top- down)
    
    // public int helper(int ind, int last, int[][] arr, int[][] dp){
    //     if(ind < 0) return 0;
    //     if(dp[ind][last] != -1) return dp[ind][last];
        
    //     int maxi= Integer.MIN_VALUE;
    //     for(int i=0; i<3; i++){
    //         if(i != last){
    //             maxi= Math.max(maxi, arr[ind][i] + helper(ind-1, i, arr, dp));
    //         }
    //     }
        
    //     return dp[ind][last] = maxi;
    // }
    // public int maximumPoints(int arr[][]) {
    //     int n= arr.length;
    //     int[][] dp= new int[n][4];
    //     for(int i=0; i<n; i++) Arrays.fill(dp[i], -1);
        
    //     return helper(n-1, 3, arr, dp);
    // }
    
    
    // tabulation
    // bottom - up
    
    // public int maximumPoints(int arr[][]){
    //     int n= arr.length;
    //     int[][] dp= new int[n][3];
        
    //     for(int i=0; i<3; i++){
    //         dp[0][i] = arr[0][i];
    //     }
        
    //     for(int i=1; i<n; i++){
    //         for(int j= 0; j<3; j++){
    //             int maxi= -1;
    //             for(int k=0; k<3; k++){
    //                 if(j != k){
    //                     maxi= Math.max(maxi, dp[i-1][k]);
    //                 }
    //             }
    //             dp[i][j]= arr[i][j]+ maxi;
    //         }
    //     }
        
    //     int maxi= -1;
    //     for(int i=0; i<3; i++){
    //         maxi= Math.max(maxi, dp[n-1][i]);
    //     }
        
    //     return maxi;
    // }
    
    
    // space optimisation
    
    public int maximumPoints(int arr[][]){
        int n= arr.length;
        int[] prev= new int[3];
        
        for(int i=0; i<3; i++){
            prev[i] = arr[0][i];
        }
        
        for(int i=1; i<n; i++){
            int[] curr= new int[3];
            for(int j= 0; j<3; j++){
                int maxi= -1;
                for(int k=0; k<3; k++){
                    if(j != k){
                        maxi= Math.max(maxi, prev[k]);
                    }
                }
                curr[j]= arr[i][j]+ maxi;
            }
            prev= curr;
        }
        
        int maxi= -1;
        for(int i=0; i<3; i++){
            maxi= Math.max(maxi, prev[i]);
        }
        
        return maxi;
    }
}