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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        } else 
            insertIntoBstHelper(root, val);
        return root;
    }

    private void  insertIntoBstHelper(TreeNode node, int val) {
        if (val < node.val) {
            if (node.left == null) 
                node.left = new TreeNode(val);
            else 
                insertIntoBstHelper(node.left, val);
        } else if (val > node.val) {
            if (node.right == null) 
                node.right = new TreeNode(val);
            else 
                insertIntoBstHelper(node.right, val);
        }
    }
}