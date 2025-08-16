import java.util.*;

class Solution {
    int[] createLps(String ch){
        int[] lps= new int[ch.length()];
        lps[0]= 0;
        int len=0;
        int i=1;
        while(i<ch.length()){
            if(ch.charAt(i) == ch.charAt(len)){
                len++;
                lps[i]= len;
                i++;
            }else{
                if(len != 0){
                    len= lps[len-1];
                }else{
                    lps[i]= 0;
                    i++;
                }
            }
        }
        
        return lps;
    }
    ArrayList<Integer> search(String pat, String txt) {
        ArrayList <Integer> ans= new ArrayList<>();
        int[] lps = createLps(pat);
        
        int i = 0, j = 0;
        while(i < txt.length()){
            
            if(txt.charAt(i) == pat.charAt(j)){
                i++;
                j++;
                if(j == pat.length()){
                    ans.add(i-j);
                    j= lps[j-1];
                }
            }else{
                if(j != 0){
                    j= lps[j-1];
                }else{
                    i++;
                }
            }
        }
        
        return ans;
    }
}