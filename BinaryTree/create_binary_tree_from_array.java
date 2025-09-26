/* 
 *  class Node {
 *    int data;
 *    Node left; 
 *    Node right;
 *    public Node() {
 *      data = 0;
 *    }
 *    public Node(int d)  {
 *      data = d;
 *    }
 *  }
 *
 *  The above class defines a tree node.
 */

// Return the root node of the tree
static Node buildTree(int arr[], int n) {
    if(n == 0) return null;
    Node root= new Node(arr[0]);
    Queue <Node> q= new LinkedList<>();
    q.add(root);
    int ind=1;
    
    while(ind<n && !q.isEmpty()){
        Node curr= q.poll();
        if(ind<n){
            curr.left= new Node(arr[ind++]);
            q.add(curr.left);
        }
        if(ind<n){
            curr.right= new Node(arr[ind++]);
            q.add(curr.right);
        }
    }
    
  return root;
}