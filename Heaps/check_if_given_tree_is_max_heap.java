static int isMaxHeap(int arr[], int n){
    for(int i= n-1 / 2; i>=0; i--){
        int left = 2*i + 1;
        int right = 2*i + 2;
        
        if(left < n && arr[i] < arr[left]) return 0;
        if(right < n && arr[i] < arr[right]) return 0;
    }
    
    return 1;
}