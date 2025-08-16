public class sorting {
    public static void main(String[] args){
        int[] arr= {38, 27, 43, 3, 9, 82, 10};
        Solution s= new Solution();

        // bubble sort
        s.bubbleSort(arr);

        // print array
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

class Solution{
    void swap(int[] arr, int i, int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }

    void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j+1] < arr[j]){
                    swap(arr, j+1, j);
                }
            }
        }
    }
}