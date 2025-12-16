class Solution {
    public int minPlatform(int arr[], int dep[]) {
        int trains=0;
        int maxi=0;
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i=0; 
        int j=0;
        int n= arr.length;
        
        while(i<n && j<n){
            if(arr[i] <= dep[j]){
                trains++;
                i++;
                maxi= Math.max(maxi, trains);
            }else{
                trains--;
                j++;
            }
        }
        
        return maxi;
    }
}
