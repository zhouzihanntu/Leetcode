import queue
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
class rightSideView:
    def solution(self, root: TreeNode) -> List[int]:
        if root == None:
            return []
        res = []
        q1 = queue.Queue()
        q1.put(root)
        while not q1.empty():
            size = q1.qsize()
            for i in range(size):
                temp = q1.get()
                if temp.left != None:
                    q1.put(temp.left)
                if temp.right != None:
                    q1.put(temp.right)
                if i == size - 1:
                    res.append(temp.val)
        return res
            
            
            
