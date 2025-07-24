package Arrays;

// Platform: Leetcode
// Problem: 75. Sort Colors
// Link: https://leetcode.com/problems/sort-colors/description/

class Solution {
    void swap(int[] nums, int i, int j){
        int temp= nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }

    public void sortColors(int[] nums) {
        int low = 0;
        int mid = nums.length - 1;
        int high= nums.length - 1;

        while(low <= mid){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
            }else if(nums[mid] == 1){
                mid--;
            }else{
                swap(nums, mid, high);
                mid--;
                high--;
            }
        }
    }
}
