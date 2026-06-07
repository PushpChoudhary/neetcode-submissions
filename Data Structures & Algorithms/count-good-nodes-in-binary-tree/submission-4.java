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
    private int helper(TreeNode root,int maxso){
        if (root== null)return 0;
        int count=0;
        if(maxso<=root.val){
            count++;
            maxso=root.val;
        }
        int left=helper(root.left,maxso);
        int right=helper(root.right,maxso);
        return count+left+right;   
    }
    public int goodNodes(TreeNode root) {
        return helper(root,Integer.MIN_VALUE);

    }
}