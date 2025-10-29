class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxi= 0;
        long curr= 0;
        int i=0;
        HashSet <Integer> hs= new HashSet<>();

        for(int j=0; j< nums.length; j++){
            while(hs.contains(nums[j])){
                curr -= nums[i];
                hs.remove(nums[i]);
                i++;
            }

            curr += nums[j];
            hs.add(nums[j]);
            if(j-i+1 == k){
                maxi= Math.max(curr, maxi);
                curr-= nums[i];
                hs.remove(nums[i]);
                i++;
            }
        }
        return maxi;
    }
}