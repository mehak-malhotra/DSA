/* The class is defined with below variables
class Graph { 
  private int V;
  private Map<Integer, List<Integer>> adjVertices;
  public Graph(int V) {
      this.V = V;
    this.adjVertices = new HashMap<Integer, List<Integer>>();
  }
  public void addVertex(int vertex) {
    adjVertices.putIfAbsent(vertex, new ArrayList<>());
  }
  public void addEdge(int src, int dest) {
    adjVertices.get(src).add(dest);
  }        */

void BFS(int v) 
{ 
    Queue <Integer> q= new LinkedList<>();
    int[] visited= new int[V];
    
    q.add(v);
    visited[v] = 1;
    System.out.print(v+" ");
    
    while(!q.isEmpty()){
        int x= q.poll();
        for(int i=0; i<adjVertices.get(x).size(); i++){
            int a= adjVertices.get(x).get(i);
            if(visited[a] == 0){
                q.add(a);
                System.out.print(a+" ");
                visited[a]= 1;
            }
        }
    }
} 
