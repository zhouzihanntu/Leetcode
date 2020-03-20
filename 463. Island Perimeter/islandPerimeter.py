class islandPerimeter:
    def solution(self, grid):
        width = len(grid)
        length = len(grid[0])
        count = 0
        for i in range(0, width):
            for j in range(0, length):
                if grid[i][j] == 1:
                    count = count + 4
                    if i > 0 and grid[i-1][j] == 1:
                        count = count - 1
                    if i + 1 < width and grid[i+1][j] == 1:
                        count = count - 1
                    if j > 0 and grid[i][j-1] == 1:
                        count = count - 1
                    if j + 1 < length and grid[i][j+1] == 1:
                        count = count -1
                    '''
                    if i > 0 and grid[i-1][j] == 1:
                        count = count - 2
                    if j > 0 and grid[i][j-1] == 1:
                        count = count - 2
                    '''
        return count

obj = islandPerimeter()
#arr = [[0,1,0,0], [1,1,1,0], [0,1,0,0], [1,1,0,0]]
arr = [[0,1]]
res = obj.solution(arr)
print(res)