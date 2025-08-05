// Platform: Leetcode
// Problem: 1011. Capacity To Ship Packages Within D Days
// Link: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/

class Solution {
    boolean check(int[] weights, int days, int mid){
        int d=1;
        int count= 0;
        for(int i:weights){
            if(count+i <= mid){
                count+= i;
            }else{
                d++;
                count=i;
            }
        }

        if(d <= days){
            return true;
        }else{
            return false;
        }
    }

    int maxel(int[] weights){
        int maxi= -1;
        for(int i:weights){
            if(i>maxi) maxi= i;
        }

        return maxi;
    }

    int sum(int[] weights){
        int s=0;
        for(int i:weights){
            s+= i;
        }
        return s;
    }

    public int shipWithinDays(int[] weights, int days) {
        int s= maxel(weights);
        int e= sum(weights);
        // int ans= -1;

        while(s<=e){
            int mid= s+ (e-s)/2;
            if(check(weights, days, mid)){
                // ans= mid;
                e= mid-1;
            }else{
                s= mid+1;
            }
        }

        return s;
    }
}