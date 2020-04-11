/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class countUnivalSubtrees {
    int res = 0;
    public int solution(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root);
        return res;
    }

    public boolean dfs(TreeNode root) {
        boolean curr = true;
        if (root == null) {
            return true;
        }
        boolean left = true;
        boolean right = true;
        if (root.left != null) {
            left = dfs(root.left);
            if (root.left.val != root.val) {
                curr = false;
            }
        }
        if (root.right != null) {
            right = dfs(root.right);
            if (root.right.val != root.val) {
                curr = false;
            }
        }
        if (curr && left && right) {
            res++;
        }
        return curr && left && right;
    }
}