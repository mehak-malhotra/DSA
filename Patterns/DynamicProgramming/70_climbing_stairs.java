class Solution {
    public int climbStairs(int n) {
        if(n <= 3) return n;

        int num1= 1;
        int num2= 2;
        int sum= num1+ num2;

        for(int i=3; i<=n; i++){
            sum= num1+ num2;
            num1= num2;
            num2= sum;
        }

        return num2;
    }
}