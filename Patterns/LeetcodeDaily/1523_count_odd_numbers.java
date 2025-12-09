class Solution {
    public int countOdds(int low, int high) {
        int range = high - low +1;
        if(range % 2 == 0) return range/2;
        
        if(high % 2 == 0){
            return (range - 1)/2;
        }else{
            return (range + 1)/2;
        }
    }
}