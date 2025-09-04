class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length - 1; i++){
            if(nums[i+1] == nums[i]){
                return nums[i];
            }
        }
        return -1;
    }
}