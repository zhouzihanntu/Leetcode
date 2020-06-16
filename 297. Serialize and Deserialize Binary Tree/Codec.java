/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return "";
        }
        List<String> res = new ArrayList<>();
        queue.offer(root);
        res.add(root.val + "");
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp.left != null) {
                queue.offer(temp.left);
                res.add(temp.left.val + "");
            } else {
                res.add("null");
            }
            if (temp.right != null) {
                queue.offer(temp.right);
                res.add(temp.right.val + "");
            } else {
                res.add("null");
            }  
        }
        while (res.get(res.size() - 1) == "null") {
            res.remove(res.size() - 1);
        }
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        int len = data.length();
        if (len == 0) {
            return null;
        }

        String[] arr = data.substring(1, len - 1).split(", ");
        if (arr[0] == "null") {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int idx = 1;
        while (!queue.isEmpty() && idx < arr.length) {
            TreeNode temp = queue.poll();
            if (temp == null) {
                continue;
            }
            
            temp.left = (!arr[idx].equals("null")) ? new TreeNode(Integer.parseInt(arr[idx])) : null;
            idx++;
            if (idx >= arr.length) {
                break;
            }
            temp.right = (!arr[idx].equals("null")) ? new TreeNode(Integer.parseInt(arr[idx])) : null;
            idx++;
            
            queue.offer(temp.left);
            queue.offer(temp.right);
        }

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));