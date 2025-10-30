class Solution {
    public boolean isSame(int[] a1, int[] a2){
        for(int i=0; i<26; i++){
            if(a1[i] != a2[i]) return false;
        }

        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ind= new ArrayList<>();

        // hash table for p
        int[] a1= new int[26];
        for(int i=0; i< p.length(); i++){
            a1[p.charAt(i) - 'a']++;
        }

        int[] a2= new int[26];
        int i=0;
        for(int j=0; j<s.length(); j++){
            char ch= s.charAt(j);
            a2[ch- 'a']++;

            char ci= s.charAt(i);
            if(j-i+1 > p.length()){
                a2[ci- 'a']--;
                i++;
            }
            
            // if equal to length, check if elements are same
            if(j-i+1 == p.length() && isSame(a1, a2)){
                ind.add(i);
            }
        }

        return ind;
    }
}