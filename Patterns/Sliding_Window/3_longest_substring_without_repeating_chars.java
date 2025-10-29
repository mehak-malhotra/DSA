class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> hs= new HashSet<>();
        int i=0;
        int maxi=0;
        int curr= 0;

        for(int j=0; j< s.length(); j++){
            char ch= s.charAt(j);
            while(hs.contains(ch)){
                hs.remove(s.charAt(i));
                i++;
            }

            hs.add(ch);
            curr= j-i+1;
            maxi= Math.max(maxi, curr);
        }

        return maxi;
    }
}