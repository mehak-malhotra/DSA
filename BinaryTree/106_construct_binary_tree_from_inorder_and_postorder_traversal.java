/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int indexOf(int[] arr, int num){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num) return i;
        }
        return -1;
    }
    
    TreeNode helper(int inStart, int inEnd, int postStart, int postEnd, int in[], int post[]){
        if(inStart > inEnd || postStart > postEnd) return null;
        
        TreeNode root= new TreeNode(post[postEnd]);
        int rootIndex= indexOf(in, post[postEnd]);
        int leftLength= rootIndex - inStart;
        
        root.left= helper(inStart, rootIndex - 1, postStart, leftLength + postStart - 1, in, post);
        root.right= helper(rootIndex + 1, inEnd, leftLength + postStart, postEnd - 1, in, post);
        
        return root;
    }
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(0, inorder.length - 1, 0, postorder.length - 1, inorder, postorder);
    }
}