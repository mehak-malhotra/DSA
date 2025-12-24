class Solution {
    public void backtrack(int i, int n, ArrayList <String> arr, String str){
        if(i == n){
            arr.add(str);
            return;
        }
        
        // choose 0
        str += "0";
        backtrack(i+1, n, arr, str);
        
        // choose 1
        str= str.substring(0, str.length() - 1);
        str += "1";
        backtrack(i+1, n, arr, str);
    }
    
    public ArrayList<String> binstr(int n) {
        ArrayList <String> arr= new ArrayList<>();
        String str= "";
        backtrack(0, n, arr, str);
        return arr;
    }
}
