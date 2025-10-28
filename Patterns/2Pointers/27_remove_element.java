class Solution {
    public void swap(int[] nums, int i, int j){
        int temp= nums[i];
        nums[i] = nums[j];
        nums[j]= temp;
    }

    public int removeElement(int[] nums, int val) {

        int i= 0;
        int j= nums.length -1;

        while(i <= j){
            if(nums[i] != val){
                i++;
            }else if(nums[j] == val){
                j--;
            }else{
                swap(nums, i, j);
                i++; j--;
            }
        }

        return i;
    }
}
