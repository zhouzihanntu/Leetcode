import queue
class colorBorder:
    def solution(self, grid, r0, c0, color):
        width = len(grid)
        length = len(grid[0])
        visited = []
        directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]
        q = queue.Queue()
        q.put((r0, c0))
        oldColor = grid[r0][c0]
        modList = []
        while not q.empty():
            temp = q.get()
            connectCount = 0
            for dr in directions:
                x = temp[0] + dr[0]
                y = temp[1] + dr[1]
                if x >= 0 and x < width and y >= 0 and y < length and grid[x][y] == oldColor:
                    if (x, y) not in visited:
                        q.put((x, y))
                    connectCount = connectCount + 1
            if connectCount < 4:
                modList.append((temp[0], temp[1]))
            visited.append(temp)
        for mod in modList:
            grid[mod[0]][mod[1]] = color
        return grid

grid = [[1,2,1,2,1,2],[2,2,2,2,1,2],[1,2,2,2,1,2]]
r0 = 1
c0 = 3
color = 1
obj = colorBorder()
res = obj.solution(grid, r0, c0, color)
print(res)