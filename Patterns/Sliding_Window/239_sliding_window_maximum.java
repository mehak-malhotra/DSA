class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n= nums.length;
        int[] maxi= new int[n-k+1];

        // we are storing indexes in dequeue
        Deque <Integer> dq= new ArrayDeque<>();

        int i=0;
        for(int j=0; j<n; j++){
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[j]) dq.pollLast();
            dq.addLast(j);

            if(j-i+1 == k){
                maxi[i] = nums[dq.peekFirst()];
                if(dq.peekFirst() == i) dq.pollFirst();
                i++;
            }
        }

        return maxi;
        
    }
}