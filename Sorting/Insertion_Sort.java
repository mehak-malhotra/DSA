package Sorting;

// Platform: Geeksforgeeks
// Problem: Insertion Sort
// Link: hhttps://www.geeksforgeeks.org/problems/insertion-sort/1

class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++){
            int j=i;
            int key= arr[i];
            
            while(j>0 && arr[j-1] > key){
                arr[j] = arr[j-1];
                j--;
            }
            
            arr[j]= key;
        }
    }
}