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
    int res = 0;
    int n = 0;
    public int kthSmallest(TreeNode root, int k) {
        n = k;
        traverse(root);
        return res;
    }
    public void traverse(TreeNode root) {
        if (root == null || n < 0) {
            return;
        }
        traverse(root.left);
        n = n - 1;
        if (n == 0) {
            res = root.val;
        }
        traverse(root.right);
    }
}