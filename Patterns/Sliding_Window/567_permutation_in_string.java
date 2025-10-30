// using hashmap {time complexity lil higher since 2 hashmaps compare horhe h every time}

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // map for s1 made
        HashMap <Character, Integer> map1= new HashMap<>();
        for(int i=0; i<s1.length(); i++){
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0) +1);
        }

        // sliding window + making hashmap for every window + comparing
        int i=0;
        HashMap <Character, Integer> map2= new HashMap<>();
        for(int j=0; j< s2.length() ; j++){
            map2.put(s2.charAt(j), map2.getOrDefault(s2.charAt(j), 0) + 1);
            if(j-i+1 == s1.length()){
                if(map1.equals(map2)) return true;
                
                if(map2.get(s2.charAt(i)) == 1){
                    map2.remove(s2.charAt(i));
                }else{
                    map2.put(s2.charAt(i), map2.get(s2.charAt(i)) - 1);
                }
                i++;
            }
        }

        return false;
    }
}

// using hash table {time, space complexity improved}

class Solution {
    public boolean isSame(int[] a1, int[] a2){
        for(int i=0; i<26; i++){
            if(a1[i] != a2[i]) return false;
        }

        return true;
    }

    public boolean checkInclusion(String s1, String s2) {

        // hash table for s1 made
        int[] a1= new int[26];
        for(int i=0; i< s1.length(); i++){
            a1[s1.charAt(i) - 'a']++;
        }

        // update hashtable for s2 as we slide window 
        int[] a2= new int[26];
        int i=0;

        for(int j=0; j< s2.length(); j++){
            char ch= s2.charAt(j);
            a2[ch- 'a']++;

            char ci= s2.charAt(i);
            if(j-i+1 > s1.length()){
                a2[ci- 'a']--;
                i++;
            }
            
            // if equal to length, check if elements are same
            if(j-i+1 == s1.length() && isSame(a1, a2)){
                return true;
            }
            
        }

        return false;
    }
}
