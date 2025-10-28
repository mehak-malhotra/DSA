// O(n) approach

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        int k= n-1;
        int[] sqs= new int[n];

        int i= 0;
        int j= n - 1;
        while(i<=j){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                sqs[k]= nums[i]*nums[i];
                i++;
            }else{
                sqs[k]= nums[j]*nums[j];
                j--;
            }
            k--;
        }

        return sqs;
    }
}

// O(2n) approach

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans= new int[nums.length];
        PriorityQueue <Integer> pq= new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]*nums[i]);
        }

        int i=0;
        while(!pq.isEmpty()){
            ans[i++] = pq.poll();
        }

        return ans;
    }
}

// O(n log n) approach
// sqauring each, then sorting the array