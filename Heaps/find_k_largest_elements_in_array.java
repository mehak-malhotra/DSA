static void printKLargest(int array[], int n, int k){
    PriorityQueue <Integer> pq= new PriorityQueue<>(
        (a, b) -> b - a
    );
    
    for(int i=0; i<n; i++){
        pq.add(array[i]);
    }
    
    for(int i=0; i<k; i++){
        System.out.print(pq.poll());
        if(i != k-1) System.out.print(" ");
    }
}
