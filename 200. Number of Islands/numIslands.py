import queue
class numIslands:
    def solution(self, grid: List[List[str]]) -> int:
        width = len(grid)
        if width == 0:
            return 0
        length = len(grid[0])
        cnt = 0
        directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]
        q = queue.Queue()
        for i in range(width):
            for j in range(length):
                if grid[i][j] == '1':
                    q.put((i, j))
                    cnt = cnt + 1
                    while not q.empty():
                        temp = q.get()
                        for d in directions:
                            x = temp[0] + d[0]
                            y = temp[1] + d[1]
                            if x >= 0 and x < width and y >= 0 and y < length and grid[x][y] == '1':
                                grid[x][y] = '0'
                                q.put((x, y))
        return cnt