class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long maxi= 0;
        int n= happiness.length;
        PriorityQueue <Integer> pq= new PriorityQueue<>((a, b) -> b- a);

        for(int i=0; i<n; i++){
            pq.add(happiness[i]);
        }

        for(int i=0; i<k; i++){
            int x= pq.poll();
            if(x-i > 0) maxi += (x-i);
        }

        return maxi;
    }
}