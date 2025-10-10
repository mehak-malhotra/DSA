class Pair<K, V>{
    K key;
    V value;
    
    Pair(K key, V value){
        this.key= key;
        this.value= value;
    }
}
class Result {
  /*     
   * Complete the 'shortestDistance' function below.
   * @params
   *   N -> number of vertices in the graph
   *   E -> number of edges in the graph
   *   edges -> 2D array of size E * 3, with E rows and 3 columns,
   *            where edges[i][0] and edges[i][1] denotes the 2 vertices having an undirected edge,
   *            and edges[i][2] denotes the weight that the edge carries
   *   src -> starting source vertex
   *
   * @return
   *   a list of integers denoting the shortest distance between each vertex and starting vertex 'src'.
   */
  
  public ArrayList<Integer> shortestDistance(int n, int e, int[][] edges, int src) {
      // creating the adj list
      ArrayList <ArrayList <Pair<Integer, Integer>>> adj= new ArrayList<>();
      for(int i=0; i<n; i++){
          adj.add(new ArrayList<>());
      }
      
      for(int i=0; i<e; i++){
          adj.get(edges[i][0]).add(new Pair<>(edges[i][1], edges[i][2]));
          adj.get(edges[i][1]).add(new Pair<>(edges[i][0], edges[i][2]));
      }
      
      ArrayList <Integer> dist= new ArrayList<>();
      int[] arr= new int[n];
      Arrays.fill(arr, Integer.MAX_VALUE);
      
      PriorityQueue <Pair<Integer, Integer>> pq= new PriorityQueue<>(
          (a, b) -> a.key - b.key
      );
      arr[src] = 0;
      pq.add(new Pair<>(0, src));
      
      while(!pq.isEmpty()){
          Pair <Integer, Integer> polled= pq.poll();
          int distance= polled.key;
          int node= polled.value;
          
          if (distance > arr[node]) continue;
          
          for(int i=0; i<adj.get(node).size(); i++){
              int node1= adj.get(node).get(i).key;
              int wt= adj.get(node).get(i).value;
              if(distance + wt < arr[node1]){
                  arr[node1] = distance + wt;
                  pq.add(new Pair<>(arr[node1], node1));
              }
          }
      }
      
      for(int i=0; i<n; i++){
          dist.add(arr[i]);
      }
      
      return dist;
  }
}