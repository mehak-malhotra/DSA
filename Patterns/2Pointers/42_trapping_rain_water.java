class Solution {
    public int trap(int[] height) {
        int left= 0;
        int leftm= height[left];
        int right= height.length - 1;
        int rightm= height[right];
        int water= 0;

        while(left < right){
            if(leftm > rightm){
                // move right
                right--;
                rightm= Math.max(height[right], rightm);
                water += rightm- height[right];
            }else{
                // move left
                left++;
                leftm= Math.max(height[left], leftm);
                water+= leftm- height[left];
            }
        }

        return water;
    }
}