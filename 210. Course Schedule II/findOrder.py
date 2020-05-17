class Solution:
    def __init__(self):
        self.res = []
        self.adjacent = []
        self.visited = []

    def dfs(self, i):
        if self.visited[i] == 1:
            return False
        if self.visited[i] == 2:
            return True
        self.visited[i] = 1
        for j in self.adjacent[i]:
            if not self.dfs(j):
                return False
        self.visited[i] = 2
        self.res.append(i)
        return True

    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        self.visited = [0] * numCourses
        self.adjacent = [[] for i in range(numCourses)]
        for cur, pre in prerequisites:
            self.adjacent[cur].append(pre)
        for i in range(numCourses):
            if not self.dfs(i):
                return []
        return self.res


