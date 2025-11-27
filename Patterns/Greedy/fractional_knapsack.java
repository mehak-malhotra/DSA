class Pair<K, V>{
    K val;
    V wt;
    
    Pair(K val, V wt){
        this.val= val;
        this.wt= wt;
    }
}

class Result
{
  static double fractionalKnapsack(int val[], int weight[], int n, int capacity)
  {
      double value = 0;
      PriorityQueue <Pair<Integer, Integer>> pq= new PriorityQueue<>((a, b) -> Double.compare((double)b.val/b.wt, (double)a.val/a.wt));
      
      for(int i=0; i<n; i++){
          pq.add(new Pair<>(val[i], weight[i]));
      }
      
      for(int i=0; i<n; i++){
          Pair<Integer, Integer> p= pq.poll();
          if(p.wt <= capacity){
              value += p.val;
              capacity -= p.wt;
          }else{
              value += (double)(p.val/p.wt)* capacity;
              break;
          }
      }
      
      return value;
  }
}