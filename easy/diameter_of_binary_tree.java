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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    // find heights of left and right subtrees to calculate diameter
    // diameter = left height + right height
    private int height(TreeNode curr) {
        if (curr == null) {
            return -1; // height of null tree is -1
        }
        int leftHeight = height(curr.left) + 1; // +1 to include curr node
        int rightHeight = height(curr.right) + 1;
        // keep track of max diameter
        diameter = Math.max(diameter, leftHeight + rightHeight);
        return Math.max(leftHeight, rightHeight);
    }
}