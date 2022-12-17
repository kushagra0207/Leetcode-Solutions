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
  
        TreeNode result = null;
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	// becasue it's BST, every node in the left side of root is less than root, every node in the right side of root is greater than root

	if (root == p || root == q) return result = root;

	// traverse to left leaf to search
	if (p.val <= root.val && q.val <= root.val) lowestCommonAncestor(root.left, p, q);
		
	// traverse to right leaf to search
	else if (p.val > root.val && q.val > root.val) lowestCommonAncestor(root.right, p, q);
		
	// if suffice the condition, save it to result, return the value
	else if ( (p.val <= root.val && q.val > root.val) || ( p.val > root.val && q.val <= root.val) ) 
		return result = root;
	return result;
	}
    
}