class Solution {
    public void backtrack(List<List<Integer>> sets, int ind, List<Integer> l, int[] nums, int n){
        sets.add(new ArrayList<>(l));

        for(int i=ind; i<n; i++){
            l.add(nums[i]);
            backtrack(sets, i+1, l, nums, n);
            l.remove(l.size()-1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sets= new ArrayList<>();
        List<Integer> l= new ArrayList<>();
        int n= nums.length;

        backtrack(sets, 0, l, nums, n);
        return sets;
    }
}