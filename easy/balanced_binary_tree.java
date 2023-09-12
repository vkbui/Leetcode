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
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        // only -1 if updated in height()
        if (height(root) == -1) {
            return false;
        }
        return true;
    }

    // gets height of current node
    public int height(TreeNode curr) {
        if (curr == null) {
            return 0;
        }
        int left = height(curr.left);
        int right = height(curr.right);
        if (left == -1 || right == -1) { // tracks imbalance if ever found
            return -1;
        }
        if (Math.abs(left - right) > 1) { // finds imbalance
            return -1;
        }
        return Math.max(left, right) + 1;
    }
}