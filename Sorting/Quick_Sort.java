// Platform: Geeksforgeeks
// Problem: Quick Sort
// Link: https://www.geeksforgeeks.org/problems/quick-sort/1

class Solution {
    public void swap(int[] arr, int i, int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    
    public void quickSort(int[] arr, int low, int high) {
        if(low >= high) return;
        int pivot= partition(arr, low, high);
        quickSort(arr, low, pivot-1);
        quickSort(arr, pivot+1, high);
    }

    private int partition(int[] arr, int low, int high) {
        int pivot= arr[high];
        int i= low;
        int j= high-1;
        
        while(i<=j){
            while(i<=j && arr[i]<= pivot) i++;
            while(j>=i && arr[j] > pivot) j--;
            if(i<j){
                swap(arr, i, j);
            }
        }
        
        swap(arr, i, high);
        return i;
    }
    
}