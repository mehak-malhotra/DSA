// using optimised brute force with complexity O(n^2)

class Solution {

    public String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder("#");
        for(int i=0; i<s.length(); i++){
            sb.append(s.charAt(i)).append("#");
        }

        String str= sb.toString();

        int maxlen=0;
        int leftmax=0;
        int rightmax=0;
        for(int i=0; i<str.length(); i++){
            int len = 0;
            int l = i, r= i;
            while(l >= 0 && r < str.length() && str.charAt(l) == str.charAt(r)){
                l--;
                r++;
                len++;
            }
            if(len > maxlen){
                maxlen= len;
                leftmax= l+1;
                rightmax= r-1;
            }
        }

        // we got the leftmax and rightmax now. create a new string from leftmax to rightmax
        StringBuilder ans= new StringBuilder();
        for(int i=leftmax; i<= rightmax; i++){
            if(str.charAt(i) != '#'){
                ans.append(str.charAt(i));
            }
        }

        return ans.toString();
    }
}