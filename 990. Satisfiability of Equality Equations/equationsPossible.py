class Solution:
    def __init__(self):
        self.parent = [-1] * 26

    def equationsPossible(self, equations: List[str]) -> bool:
        uneq = []
        for eq in equations:
            if eq[1] == '=':
                self.union(ord(eq[0]) - ord('a'), ord(eq[3]) - ord('a'))
            else:
                uneq.append((ord(eq[0]) - ord('a'), ord(eq[3]) - ord('a')))

        for p, q in uneq:
            if self.findRoot(p) == self.findRoot(q):
                return False
        return True

    def union(self, a, b):
        aRoot = self.findRoot(a)
        bRoot = self.findRoot(b)
        if aRoot == bRoot:
            return
        self.parent[aRoot] = bRoot
    
    def findRoot(self, x):
        while self.parent[x] != -1:
            x = self.parent[x]
        return x