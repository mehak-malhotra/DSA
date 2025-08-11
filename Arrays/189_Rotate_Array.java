// Platform: Leetcode
// Problem: 189. Rotate Array
// Link: https://leetcode.com/problems/rotate-array/description/

class Solution {
    void reverse(int[] nums, int s, int e){
        while(s<e){
            int temp= nums[s];
            nums[s]= nums[e];
            nums[e]= temp;
            s++; 
            e--;
        } 
    }
    public void rotate(int[] nums, int k) {
        k= k % nums.length;
        // if(nums.length == 1) return;
        reverse(nums, 0, nums.length - k -1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }
}