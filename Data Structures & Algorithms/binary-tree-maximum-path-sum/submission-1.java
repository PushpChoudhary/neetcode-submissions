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
    public int maxPathSum(TreeNode root) {
        int []resu=new int[]{root.val};
        dfs(root,resu);
        return resu[0];
    }
    private int dfs(TreeNode root,int[]resu){
        if (root==null)return 0;
        int left=Math.max(dfs(root.left,resu),0);
        int right=Math.max(dfs(root.right,resu),0);
        resu[0]=Math.max(root.val+left+right,resu[0]);
        return root.val+Math.max(left,right);
    }
}
