/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    HashMap<TreeNode, TreeNode> map= new HashMap<>();
    HashSet<TreeNode> set= new HashSet<>();
    List<Integer> arr= new ArrayList<>();

    public void findParent(TreeNode root){
        if(root == null) return;
        if(root.left != null){
            map.put(root.left, root);
            findParent(root.left);
        }
        if(root.right != null){
            map.put(root.right, root);
            findParent(root.right);
        }
    }

    public void helper(TreeNode target, int dist, int k){
        set.add(target);
        if(dist == k){
            arr.add(target.val);
            return;
        }

        if(target.left != null && !set.contains(target.left)){
            helper(target.left, dist+1, k);
        }

        if(map.get(target) != null && !set.contains(map.get(target))){
            helper(map.get(target), dist+1, k);
        }

        if(target.right != null && !set.contains(target.right)){
            helper(target.right, dist+1, k);
        }
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        map.put(root, null);
        findParent(root);
        helper(target, 0, k);
        return arr;
    }
}