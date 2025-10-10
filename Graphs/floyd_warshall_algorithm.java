import java.util.*;
g
class Result {
  /*
   * Complete the 'allPairShortestDist' function below.
   * @params
   *   N -> number of vertices in the graph
   *   E -> number of edges in the graph
   *   edges -> 2D array of size E * 3, with E rows and 3 columns,
   *             where edges[i][0] and edges[i][1] denotes a directed edge between them,
   *             and edges[i][2] denotes the weight that the edge carries
   *
   * @return
   *   the result[][] matrix where result[u][v] denotes the shortest path from vertex u to vertex v.
   */
  
  public ArrayList<ArrayList<Integer>> allPairShortestDist(int n, int e, int[][] edges) {
      // creating the adjacency matrix
      int[][] result = new int[n][n];
      for(int i=0; i<n; i++){
          Arrays.fill(result[i], Integer.MAX_VALUE);
      }
      
      for(int i=0; i<e; i++){
          int node1= edges[i][0];
          int node2= edges[i][1];
          int wt= edges[i][2];
          result[node1][node2]= wt;
      }
      
      int k=0;
      while(k<n){
          result[k][k]= 0;
          k++;
      }
      
      // implementation of floyd warshall
      for(int via=0; via<n; via++){
          for(int i=0; i<n; i++){
              for(int j=0; j<n; j++){
                  if(result[i][via] != Integer.MAX_VALUE && result[via][j] != Integer.MAX_VALUE){
                      result[i][j]= Math.min(result[i][j], result[i][via] + result[via][j]);
                  }
              }
          }
      }
      
      //assigning -1 to unreachable vertices
      for(int i=0; i<n; i++){
          for(int j=0; j<n; j++){
              if(result[i][j] == Integer.MAX_VALUE){
                  result[i][j] = -1;
              }
          }
      }
      
      ArrayList<ArrayList<Integer>> paths= new ArrayList<>();
      for(int i=0; i<n; i++){
          paths.add(new ArrayList<>());
          for(int j=0; j<n; j++){
              paths.get(i).add(result[i][j]);
          }
      }
      
      return paths;
  }
}