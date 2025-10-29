class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int mini= Integer.MAX_VALUE;
        int curr= 0;
        for(int j=0; j<nums.length; j++){
            curr += nums[j];

            while(curr >= target){
                if(j-i+1 < mini) mini= j-i+1;
                curr -= nums[i];
                i++; 
            }

        }

        return mini==Integer.MAX_VALUE? 0: mini;
    }
}