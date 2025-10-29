class Solution {
    public int longestMountain(int[] arr) {
        int maxi= 0;
        int i=1;
        while(i<arr.length - 1){
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                int left= i-1;
                int right= i+1;
                int curr= 3;
                
                while(left > 0 && arr[left-1] < arr[left]){
                    left--;
                    curr++;
                }

                while(right < arr.length - 1 && arr[right+1] < arr[right]){
                    right++;
                    curr++;
                }

                maxi= Math.max(maxi, curr);
                i= right +1;
            }else{
                i++;
            }
        }

        return maxi;
    }
}