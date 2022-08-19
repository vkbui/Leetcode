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

// video explanation: https://www.youtube.com/watch?v=eD3tmO66aBA

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) { // root is empty or is a leaf
            return 0;
        }
        
        int left = maxDepth(root.left); // gets the depth of the left child
        int right = maxDepth(root.right); // gets the depth of the right child
        
        return Math.max(left, right) + 1; // returns greater depth and adds curr node
    }
}