package BinarySearch;

// Platform: Leetcode
// Problem 704: Binary Search
// Link: https://leetcode.com/problems/binary-search/

class Solution {
    public int search(int[] nums,int target){
        return searchB(nums, target, 0, nums.length -1);
    }

    int searchB(int[] nums, int target, int s, int e) {
        if(s>e){
            return -1;
        }

        int mid= s+ (e-s)/2;
        if(nums[mid] == target){
            return mid;
        }

        if(nums[mid]< target){
            return searchB(nums, target, mid+1,e);
        }else{
            return searchB(nums, target, s, mid-1);
        }
    }
}