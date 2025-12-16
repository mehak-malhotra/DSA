class Solution {
    public long getDescentPeriods(int[] prices) {
        int n= prices.length;

        long count=0;
        int i=0;
        int j= i+1;

        while(i<n && j<n){
            if(prices[j-1] - prices[j] == 1){
                j++;
            }else{
                long length= j-i;
                count += (length*(length +1))/2;
                i = j;
                j= i+1;
            }
        }

        long length= j-i;
        count += (length*(length +1))/2;

        return count;
    }
}