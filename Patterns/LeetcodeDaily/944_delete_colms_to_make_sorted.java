class Solution {
    public int minDeletionSize(String[] strs) {
        int mini=0;
        boolean isremoved= false;
        int m= strs.length;
        int n= strs[0].length();

        for(int i=0; i<n; i++){
            for(int j=0; j<m-1; j++){
                if(isremoved) continue;

                int n1= strs[j].charAt(i) - 'a';
                int n2= strs[j+1].charAt(i) - 'a';

                if(n2 < n1){
                    mini++;
                    isremoved= true;
                }
            }
            isremoved= false;
        }

        return mini;
    }
}