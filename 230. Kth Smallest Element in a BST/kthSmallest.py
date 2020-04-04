# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def __init__(self):
        self.res = 0
        self.n = 0
    def kthSmallest(self, root: TreeNode, k: int) -> int:
        self.n = k
        self.traverse(root)
        return self.res
    def traverse(self, root):
        if root == None or self.n < 0:
            return
        self.traverse(root.left)
        self.n = self.n - 1
        if self.n == 0:
            self.res = root.val
        self.traverse(root.right)
