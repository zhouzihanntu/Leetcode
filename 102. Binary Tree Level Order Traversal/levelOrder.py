# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
import queue
class Solution:
    def levelOrder(self, root: TreeNode) -> List[List[int]]:
        res = []
        if not root:
            return res
        q = queue.Queue()
        q.put(root)
        while not q.empty():
            count = q.qsize()
            l = []
            while count > 0:
                temp = q.get()
                l.append(temp.val)
                if temp.left:
                    q.put(temp.left)
                if temp.right:
                    q.put(temp.right)
                count -= 1
            res.append(l)
        return res