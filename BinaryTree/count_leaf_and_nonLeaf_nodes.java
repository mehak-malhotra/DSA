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
  static int countLeafs(Node root) {
      if(root == null) return 0;
      if(root.left == null && root.right == null) return 1;
      return countLeafs(root.left) + countLeafs(root.right);
  }

  static int countNonLeafs(Node root) {
      if(root == null) return 0;
      if(root.left == null && root.right == null) return 0;
      return countNonLeafs(root.left) + countNonLeafs(root.right) + 1;
  }
}