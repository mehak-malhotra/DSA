class Solution {
    void helper(List<List<Integer>> list, List<Integer> l, int k, int n, int sum, int ind){
        if(sum == n){
            if(l.size() == k) list.add(new ArrayList<>(l));
            return;
        }

        if(sum > n || l.size() >= k || ind > 9) return;

        for(int i=ind; i<10; i++){
            l.add(i);
            helper(list, l, k, n, sum+i, i+1);
            l.remove(l.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list= new ArrayList<>();
        List<Integer> l= new ArrayList<>();
        helper(list, l, k, n, 0, 1);
        return list;
    }
}