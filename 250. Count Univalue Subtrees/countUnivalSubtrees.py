class countUnivalSubtrees:
    def solution(self, root):
        self.count = 0
        self.is_valid_part(root, 0)
        return self.count

    def is_valid_part(self, node, val):
        if node is None:
            return True
        if not all([self.is_valid_part(node.left, node.val),
                    self.is_valid_part(node.right, node.val)]):
            return False
        self.count += 1
        return node.val == val