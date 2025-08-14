// Platform: Leetcode
// Problem: 34. Find First and Last Position of Element in Sorted Array
// Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ind= new int[2];
        ind[0]= firstOcc(nums, target, 0, nums.length -1);
        ind[1]= lastOcc(nums, target, 0, nums.length -1);
        return ind;
    }

    int firstOcc(int[] nums, int target, int s, int e){
        int ans= -1;
        while(s<=e){
            int mid= s+(e-s)/2;
            if(nums[mid] == target){
                ans= mid;
                e= mid-1;
            }else if(nums[mid] > target){
                e= mid-1;
            }else{
                s= mid+1;
            }
        }
        return ans;
    }

    int lastOcc(int[] nums, int target, int s, int e){
        int ans= -1;
        while(s<=e){
            int mid= s+(e-s)/2;
            if(nums[mid] == target){
                ans= mid;
                s= mid+1;
            }else if(nums[mid]> target){
                e= mid-1;
            }else{
                s= mid+1;
            }
        }
        return ans;
    }
}