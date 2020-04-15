import queue
class updateMatrix:
    def solution(self, matrix):
        width = len(matrix)
        length = len(matrix[0])
        directions = [(-1, 0), (0, 1), (0, -1), (1, 0)]
        q = queue.Queue()
        for i in range(width):
            for j in range(length):
                if matrix[i][j] == 0:
                    q.put((i, j))
                else:
                    matrix[i][j] = -1
        while not q.empty():
            temp = q.get()
            for d in directions:
                x = temp[0] + d[0]
                y = temp[1] + d[1]
                if x >= 0 and x < width and y >= 0 and y < length and matrix[x][y] == -1:
                    matrix[x][y] = matrix[temp[0]][temp[1]] + 1
                    q.put((x, y))
        return matrix

obj = updateMatrix()
arr = [[0,0,0],[0,1,0],[1,1,1],[1,1,1]]
res = obj.solution(arr)
for i in range(len(res)):
	print(res[i])