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
/** Kushagra MEthod of recursive*
*   public void preOrder(TreeNode root){
*if(root==null){
*return ;
*}
*System.out.println(root.data + " ");
*preOrder(root.left);
*preOreder(root.right);
*}
*
*///
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        dfs(root,list);
        return list;
        
    }
    private void dfs(TreeNode node, List<Integer> list){
        if(node==null) return;
        list.add(node.val);
        dfs(node.left,list);
        dfs(node.right,list);
    }
}