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

/**
    4               4
  2   7    -->    7   2
1  3 6  9       9  6 3  1

at root 4 - go left
swaps 2 and 7 - at 7, go left 
swaps 6 and 9 - at 9, go left
9 has no left - at 9, go right
9 has no right - at 7, go right
6 has no left - at 6, go right
6 has no right - at 4, go right (7 finished)
swaps 1 and 3 - at 3, go left
3 has no left - at 3, go right
3 has no right - at 2, go right
1 has no left - at 1, go right
1 has no right - at 4 (2 finished) (4 finished)
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) { // root is empty
            return root;
        }
        
        // swaps left and right nodes, NOT just values
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        
        // recursion
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }
}