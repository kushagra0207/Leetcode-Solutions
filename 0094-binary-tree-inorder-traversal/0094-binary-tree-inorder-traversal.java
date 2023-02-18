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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        kushagra(root,list);
        return list;
        
    }
    public static void kushagra(TreeNode root,ArrayList<Integer> list){
      if(root==null){
        return;
      }
      
        kushagra(root.left,list);
        list.add(root.val);
        kushagra(root.right,list);
      

    }
}