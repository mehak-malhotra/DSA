class Solution {
    public void backtrack(List<List<Integer>> l, List<Integer> sub, int ind, int[] nums, int n){
        if(ind >= n){
            l.add(new ArrayList<>(sub));
            return;
        }

        sub.add(nums[ind]);
        backtrack(l, sub, ind+1, nums, n);
        
        sub.remove(sub.size() - 1);

        while(ind+1 < n && nums[ind+1] == nums[ind]) ind++;
        backtrack(l, sub, ind+1, nums, n);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> l= new ArrayList<>();
        List<Integer> sub= new ArrayList<>();
        int n= nums.length;

        Arrays.sort(nums);
        backtrack(l, sub, 0, nums, n);
        return l;
    }
}