# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isSymSubTree(self, a, b):
        if not a and not b:
            return True
        if not a or not b:
            return False
        if a.val != b.val:
            return False
        return self.isSymSubTree(a.left, b.right) and self.isSymSubTree(a.right, b.left)

    def isSymmetric(self, root: TreeNode) -> bool:
        if not root:
            return True
        return self.isSymSubTree(root.left, root.right)