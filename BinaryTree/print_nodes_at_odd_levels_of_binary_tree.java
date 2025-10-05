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

class Result {
  static void printOdd(Node root) {
      if(root == null) return;
      Queue <Node> q= new LinkedList<>();
      q.add(root);
      boolean print= true;
      
      while(!q.isEmpty()){
          int n= q.size();
          for(int i=0; i<n; i++){
              Node polled= q.poll();
              if(print == true) System.out.print(polled.data+ " ");
              if(polled.left != null) q.add(polled.left);
              if(polled.right != null) q.add(polled.right);
          }
          print = !print;
      }
  }
}