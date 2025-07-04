package Sorting;

// Platform: Geeksforgeeks
// Problem: Selection Sort
// Link: https://www.geeksforgeeks.org/problems/selection-sort/1

class Solution {
    void selectionSort(int[] arr) {
        int mini;
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            mini=i;
            for(int j= i+1; j<n; j++){
                if(arr[j] < arr[mini]){
                    mini= j;
                }
            }
            if(mini != i){
                int temp= arr[i];
                arr[i]= arr[mini];
                arr[mini]= temp;
            }
        }
    }
}