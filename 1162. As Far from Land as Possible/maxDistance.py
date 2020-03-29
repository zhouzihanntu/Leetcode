import queue
class maxDistance:
    def solution(self, grid):
        n = 0
        N = len(grid)
        q = queue.Queue()
        dxy = [(-1,0), (1, 0), (0, -1), (0, 1)]
        for i in range(0, N):
            for j in range(0, N):
                if grid[i][j]:
                    q.put((i, j))
        while not q.empty():
            size = q.qsize()
            n = n + 1
            for i in range(0, size):
                temp = q.get()
                for d in dxy:
                    x = temp[0] + d[0]
                    y = temp[1] + d[1]
                    if x >= 0 and x < N and y >= 0 and y < N and grid[x][y] == 0:
                        grid[x][y] = 1
                        q.put((x, y))
        return -1 if n == 1 else n - 1

obj = maxDistance()
# grid = [[0,0,1],[0,0,0],[1,0,1]]
grid = [[1,1,1,1,1],[1,1,1,1,1],[1,1,1,1,1],[1,1,1,1,1],[1,1,1,1,1]]
res = obj.solution(grid)
print(res)