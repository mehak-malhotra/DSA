class Solution {
    public int countPermutations(int[] complexity) {
        int n= complexity.length;
        int mod= 1000000007;

        for(int i=1; i<n; i++){
            if(complexity[i] <= complexity[0]) return 0;
        }

        long fact= 1;
        for(int i=1; i<n; i++){
            fact = ((long)fact*i) % mod;
        }

        return (int)fact;
    }
}