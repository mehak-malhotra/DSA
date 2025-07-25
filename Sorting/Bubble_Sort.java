// Platform: Geeksforgeeks
// Problem: Bubble Sort
// Link: https://www.geeksforgeeks.org/problems/bubble-sort/1

class Solution {
    public static void bubbleSort(int arr[]) {
        boolean swapped;
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            swapped= false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j+1] < arr[j]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }swapped=true;
            }
            if(!swapped) break;
        }
    }
}

