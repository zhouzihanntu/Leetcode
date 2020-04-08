import queue
class movingCount:
    def solution(self, m: int, n: int, k: int) -> int:
        if k == 0:
            return 1
        visited = [[0] * n for i in range(0, m)]
        return self.dfs(0, 0, m, n, k, visited)

    def dfs(self, i, j, m, n, k, visited):
        if i >= m or j >= n or (i // 10 + i % 10 + j // 10 + j % 10) > k or visited[i][j] > 0:
            return 0
        visited[i][j] = 1
        return self.dfs(i + 1, j, m, n, k, visited) + self.dfs(i, j + 1, m, n, k, visited) + 1


obj = movingCount()
m = 2
n = 3
k = 1
res = obj.solution(m, n, k)
print(res)