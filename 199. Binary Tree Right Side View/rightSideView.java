/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class rightSideView {
    public List<Integer> solution(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> q1 = new LinkedList<>();
        q1.offer(root);
        while (!q1.isEmpty()) {
            int size = q1.size();
            for (int i = 0; i < size; i ++) {
                TreeNode temp = q1.poll();
                if (temp.left != null) {
                    q1.offer(temp.left);
                }
                if (temp.right != null) {
                    q1.offer(temp.right);
                }
                if (i == size - 1) {
                    res.add(temp.val);
                }
            }
        }
        return res;
    }
}