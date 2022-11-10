/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; 
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //ancestor means parents of two childs
            // most frequnet questionsif
            
       
            //kushagragupta code for Ancestors
            
            
           // do with dfs and do with base conditions easily.
            //
            if(root==null || root==p || root==q) return root;
            
            TreeNode left = lowestCommonAncestor(root.left,p,q);
            TreeNode right = lowestCommonAncestor(root.right,p,q);
            
            if(left!=null && right!=null) return root;
            if(left!=null) return left;
            if(right!=null) return right;
            return null;
            
            
            
    }
}