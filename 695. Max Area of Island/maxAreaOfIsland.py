class maxAreaOfIsland:
    def solution(self, grid) -> int:
        area = 0
        for i in range(0, len(grid)):
            for j in range(0, len(grid[0])):
                if grid[i][j] == 1:
                    area = max(area, self.dfs(i, j, grid))
        return area

    def dfs(self, x, y, grid):
        if x < 0 or x >= len(grid) or y < 0 or y >= len(grid[0]) or grid[x][y] != 1:
            return 0
        grid[x][y] = 2
        count = 1
        count = count + self.dfs(x - 1, y, grid)
        count = count + self.dfs(x + 1, y, grid)
        count = count + self.dfs(x, y - 1, grid)
        count = count + self.dfs(x, y + 1, grid)
        return count


arr =[[0,0,1,0,0,0,0,1,0,0,0,0,0],
	 [0,0,0,0,0,0,0,1,1,1,0,0,0],
	 [0,1,1,0,1,0,0,0,0,0,0,0,0],
	 [0,1,0,0,1,1,0,0,1,0,1,0,0],
	 [0,1,0,0,1,1,0,0,1,1,1,0,0],
	 [0,0,0,0,0,0,0,0,0,0,1,0,0],
	 [0,0,0,0,0,0,0,1,1,1,0,0,0],
	 [0,0,0,0,0,0,0,1,1,0,0,0,0]]
arr1 = [[1]]
obj = maxAreaOfIsland()
res = obj.solution(arr1)
print(res)