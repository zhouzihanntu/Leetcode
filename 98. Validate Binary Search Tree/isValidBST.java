/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class isValidBST {
    public List<Integer> nums = new ArrayList<Integer>();
    public boolean solution(TreeNode root) {
        return checkBST(root);
    }

    public boolean checkBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean left = checkBST(root.left);
        if (nums.size() > 0 && nums.get(nums.size() - 1) >= root.val) {
            return false;
        }
        nums.add(root.val);
        boolean right = checkBST(root.right);
        return (left && right) ? true : false;
    }
}