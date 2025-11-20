// User function Template for Java

class Solution {
    static int solve(int bt[]) {
        int wait=0;
        int sum= 0;
        Arrays.sort(bt);
        
        for(int i=0; i<bt.length; i++){
            sum += wait;
            wait += bt[i];
        }
        
        return sum/bt.length;
    }
}
