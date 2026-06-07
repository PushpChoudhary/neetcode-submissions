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
    public int kthSmallest(TreeNode root, int k) {
        if (root==null)return -1;
        order(root);
        return ar.get(k-1);
    }
    ArrayList<Integer> ar=new ArrayList<>();
    public void order(TreeNode root){
        if (root==null)return;
        order(root.left);
        ar.add(root.val);
        order(root.right);
    }
}
