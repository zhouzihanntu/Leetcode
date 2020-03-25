class surfaceArea:
    def solution(self, grid):
        N = len(grid)
        count = 0
        for i in range(0, N):
            for j in range(0, N):
                if grid[i][j] > 0:
                    count = count + 4 * grid[i][j] + 2
                    if i > 0 and grid[i-1][j] > 0:
                        count = count - 2 * grid[i][j] if grid[i][j] < grid[i-1][j] else count - 2 * grid[i-1][j]
                    if j > 0 and grid[i][j-1] > 0:
                        count = count - 2 * grid[i][j] if grid[i][j] < grid[i][j-1] else count - 2 * grid[i][j-1]
        return count

#grid = [[2]]
#grid = [[1,2],[3,4]]
#grid = [[1,0],[0,2]]
#grid = [[1,1,1],[1,0,1],[1,1,1]]
grid = [[2,2,2],[2,1,2],[2,2,2]]
obj = surfaceArea()
res = obj.solution(grid)
print(res)
