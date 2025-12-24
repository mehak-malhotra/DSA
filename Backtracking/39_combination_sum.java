class Solution {
    void helper(int[] nums, int target, int i, int n, List<Integer> l, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(l));
            return;
        }

        if(i >= n ||nums[i] > target) return;

        // pick
        l.add(nums[i]);
        helper(nums, target- nums[i], i, n, l, ans);

        // not pick
        l.remove(l.size() - 1);
        helper(nums, target, i+1, n, l, ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> l= new ArrayList<>();
        Arrays.sort(candidates);

        helper(candidates, target, 0, candidates.length, l, ans);
        return ans;
    }
}