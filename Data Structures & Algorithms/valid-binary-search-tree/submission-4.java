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
public class Solution {
    public boolean isValidBST(TreeNode root) {
        // return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
        inOrder(root);
        for(int i=1;i<ar.size();i++){
            if (ar.get(i)<=ar.get(i-1))return false;
        }
        return true;
    }
    ArrayList<Integer> ar=new ArrayList<>();
    public void inOrder(TreeNode root){
        if(root==null)return;
        inOrder(root.left);
        ar.add(root.val);
        inOrder(root.right);
    }
    // public boolean valid(TreeNode node, long left, long right) {
    //     if (node == null) {
    //         return true;
    //     }
    //     if (!(left < node.val && node.val < right)) {
    //         return false;
    //     }
    //     return valid(node.left, left, node.val) &&
    //            valid(node.right, node.val, right);
    // }
}