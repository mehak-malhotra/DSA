class Solution {
    public int specialTriplets(int[] nums) {
        int n= nums.length;
        final int MOD = 1000000007;
        HashMap <Integer, Integer> h1= new HashMap<>();
        HashMap <Integer, Integer> h2= new HashMap<>();

        for(int i=0; i<n; i++){
            h1.put(nums[i], h1.getOrDefault(nums[i], 0) + 1);
        }

        long count= 0;
        for(int i=0; i<n; i++){
            h1.put(nums[i], h1.get(nums[i]) - 1);
            int leftCount= h2.getOrDefault(nums[i]*2, 0);
            int rightCount= h1.getOrDefault(nums[i]*2, 0);
            count = (count + (long)(leftCount * rightCount)) % MOD;
            h2.put(nums[i], h2.getOrDefault(nums[i], 0) + 1);
        }

        return (int)count;
    }
}