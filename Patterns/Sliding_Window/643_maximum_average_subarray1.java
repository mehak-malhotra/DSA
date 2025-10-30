class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        long sum=0;
        long maxi=Integer.MIN_VALUE;

        for(int j=0; j < nums.length ; j++){
            sum += nums[j];
            if(j-i+1 == k){
                long av= sum;
                maxi= Math.max(maxi, av);
                sum-= nums[i];
                i++;
            }
        }

        return (double)maxi/k;
    }
}