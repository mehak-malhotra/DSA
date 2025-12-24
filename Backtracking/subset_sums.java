// User function Template for Java//User function Template for Java
class Solution {
    public void helper(ArrayList <Integer> sums, int sum, int i, int n, int[] arr){
        if(i > n) return;
        if(i == n){
            sums.add(sum);
            return;
        }
        
        // not pick
        helper(sums, sum, i+1, n, arr);
        
        // pick
        sum += arr[i];
        helper(sums, sum, i+1, n, arr);
        
    }
    
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList <Integer> sums= new ArrayList<>();
        helper(sums, 0, 0, arr.length, arr);
        return sums;
    }
}