static void heapify(int[] arr, int n, int root){
    int largestIndex= root;
    int left = 2*root + 1;
    int right = 2*root + 2;
    
    if(left < n && arr[largestIndex] < arr[left]){
        largestIndex= left;
    }
    
    if(right < n && arr[largestIndex] < arr[right]){
        largestIndex= right;
    }
    
    if(largestIndex != root){
        int temp= arr[largestIndex];
        arr[largestIndex] = arr[root];
        arr[root]= temp;
        heapify(arr, n, largestIndex);
    }
}

static void modifyMintoMax(int array[], int n)
{
    for(int i= n-1 / 2; i>=0; i--){
        heapify(array, n, i);
    }
}