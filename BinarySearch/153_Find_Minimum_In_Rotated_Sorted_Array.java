package BinarySearch;

// Platform: Leetcode
// Problem: 153. Find Minimum in Rotated Sorted Array
// Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) return nums[0];

        int low= 0;
        int high= nums.length -1;
        int mid;

        while(low < high){
            mid= low + (high-low)/2;
            if(nums[mid+1] < nums[mid]){
                return nums[mid+1];
            }

            if(nums[mid] >= nums[low]){
                low= mid+1;
            }else{
                high= mid;
            }
        }

        return nums[0];
    }
}