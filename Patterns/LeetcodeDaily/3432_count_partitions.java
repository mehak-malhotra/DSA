class Solution {
    public int sum(int nums[]){
        int sumi= 0;
        for(int i: nums){
            sumi += i;
        }
        return sumi;
    }

    public int countPartitions(int[] nums) {
        int n= nums.length;
        int leftSum = 0;
        int rightSum= sum(nums);
        
        int count=0;

        for(int i=0; i< n-1; i++){
            leftSum += nums[i];
            rightSum -= nums[i];
            if((leftSum - rightSum) % 2 == 0) count++;
        }

        return count;
    }
}