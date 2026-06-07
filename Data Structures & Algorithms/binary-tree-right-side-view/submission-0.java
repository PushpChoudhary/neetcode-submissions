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
    List<List<Integer>> an=new ArrayList<>();
    public void helper(TreeNode root,int level){
        if(an.size()==level){
            an.add(new ArrayList<Integer>());
        }
        an.get(level).add(root.val);
        if(root.left!=null)helper(root.left,level+1);
        if(root.right!=null)helper(root.right,level+1);
        return;
    }
    List<Integer> fi=new ArrayList<>();
    public void helper2(){
        for(int i=0;i<an.size();i++){
            fi.add(an.get(i).get(an.get(i).size()-1));
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null)return fi;
        helper(root,0);
        helper2();
        return fi;
    }
}
