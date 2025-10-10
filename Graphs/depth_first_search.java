/* The class is defined with below variables
  class Graph 
{ 
  private Map<Integer, List<Integer>> adjVertices;
  public Graph() {
    this.adjVertices = new HashMap<Integer, List<Integer>>();
  }
  public void addVertex(int vertex) {
    adjVertices.putIfAbsent(vertex, new ArrayList<>());
  }
  public void addEdge(int src, int dest) {
    adjVertices.get(src).add(dest);
  }        */

void DFSUtil(int v, int visited[]) 
{ 
    if(visited[v] == 1) return;
    System.out.print(v+" ");
    visited[v] = 1;
    
    for(int i=0; i<adjVertices.get(v).size(); i++){
        DFSUtil(adjVertices.get(v).get(i), visited);
    }
} 

void DFS(int v) 
{ 
    int x= adjVertices.size();
    int[] visited= new int[x];
    DFSUtil(v, visited);
} 
