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
        ArrayList<Integer> arr = new ArrayList<>();
        Kushagra(root,arr);
        return arr;
    
    }
    
    
    
    public static void Kushagra(TreeNode root, List arr){
        if(root!=null){
            Kushagra(root.left,arr);
            arr.add(root.val);
            Kushagra(root.right,arr);
        }
    }
}