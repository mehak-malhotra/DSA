// Platform: Geeksforgeeks
// Problem: Merge Sort
// Link: https://www.geeksforgeeks.org/problems/merge-sort/1

class Solution {

    void mergeSort(int arr[], int low, int high) {
        if (low >= high) return;

        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        // Avoid extra vars like m, reuse loop vars
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[low + i];
        }

        for (int j = 0; j < n2; j++) {
            arr2[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            arr[k++] = arr1[i++];
        }

        while (j < n2) {
            arr[k++] = arr2[j++];
        }
    }
}

// optimised code
class Solution1{
    
    void mergeSort(int arr[], int low, int high){
        int[] temp= new int[arr.length];
        mergeSortFunc(arr, temp, low, high);
    }
    
    void mergeSortFunc(int arr[], int[] temp, int low, int high) {
        if(low >= high) return;
        int mid= low + (high-low)/2;
        mergeSortFunc(arr, temp, low, mid);
        mergeSortFunc(arr, temp, mid+1, high);
        merge(arr, temp, low, mid, high);
    }
    
    void merge(int[] arr, int[] temp, int low, int mid, int high){
        int i= low;
        int j= mid+1;
        int k= low;
        
        while(i <= mid && j <= high){
            if(arr[i] <= arr[j]){
                temp[k++]= arr[i++];
            }else{
                temp[k++]= arr[j++];
            }
        }
        
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        
        while(j<= high){
            temp[k++]= arr[j++];
        }
        
        for(int l=low; l<=high; l++){
            arr[l]= temp[l];
        }
    }
    
}