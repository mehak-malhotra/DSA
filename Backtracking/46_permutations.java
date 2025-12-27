class Solution {
    void swap(int[] nums, int i, int j){
        int temp= nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }

    void helper(int[] nums, int ind, int n, List<List<Integer>> list){
        if(ind == n-1){
            ArrayList<Integer> l= new ArrayList<>();
            for(int i=0; i<n; i++){
                l.add(nums[i]);
            }
            
            list.add(l);
            return;
        }

        for(int i=ind; i<n; i++){
            swap(nums, i, ind);
            helper(nums, ind+1, n, list);
            swap(nums, i, ind);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        helper(nums, 0, nums.length, list);
        return list;
    }
}