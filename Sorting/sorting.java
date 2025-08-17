public class sorting {
    public static void main(String[] args){
        int[] arr= {38, 27, 43, 3, 9, 82, 10};
        Solution s= new Solution();

        // bubble sort
        // s.bubbleSort(arr);

        // selection sort
        // s.selectionSort(arr);

        // insertion sort
        // s.insertionSort(arr);

        // quick sort
        // s.quickSort(arr, 0, arr.length -1);

        // merge sort
        s.mergeSort(arr, 0, arr.length - 1);

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
        // swap adjacents
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j+1] < arr[j]){
                    swap(arr, j+1, j);
                }
            }
        }
    }

    void selectionSort(int[] arr){
        // find the minimum and keep at front
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            int mini= i;
            for(int j= i+1; j<n; j++){
                if(arr[j] < arr[mini]){
                    mini= j;
                }
            }
            swap(arr, mini, i);
        }
    }

    void insertionSort(int[] arr){
        int n= arr.length;
        for(int i=1; i<n; i++){
            int temp = arr[i];
            int j= i-1;
            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    int partitionEl(int[] arr, int low, int high){
        int pivot= arr[high];
        int i= low;
        int j= high-1;
        while(i <= j){
            while(i<=j && arr[i] <= pivot){
                i++;
            }
            while(j>= i && arr[j] > pivot){
                j--;
            }

            if(i<j) swap(arr, i, j);
        }

        arr[high]= arr[i];
        arr[i]= pivot;

        return i;
    }

    // pivot last element
    void quickSort(int[] arr, int low, int high){
        if(low >= high) return;
        int partition= partitionEl(arr, low, high);
        quickSort(arr, partition+1, high);
        quickSort(arr, low, partition-1);
    }

    void merge(){

    }

    void mergeSort(int[] arr, int low, int high){

    }
}