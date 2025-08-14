// Platform: Leetcode
// Problem: 33. Search in Rotated Sorted Array
// Link: https://leetcode.com/problems/search-in-rotated-sorted-array/description/

class Solution {
    public int search(int[] nums, int target) {
        int low= 0;
        int high= nums.length -1;
        int mid;

        while(low<=high){
           mid= low+ (high-low)/2;
            // check if mid is target
           if(nums[mid] == target){
            return mid;
           } 

           // check if left or right part is sorted
           if(nums[low]<= nums[mid]){
                if(nums[low] <= target && target <= nums[mid]){
                    high= mid;
                }else{
                    low= mid+1;
                }
           }else{
                if(nums[mid] <= target && target <= nums[high]){
                    low= mid;
                }else{
                    high= mid-1;
                }
           }
        }

        return -1;
    }
}