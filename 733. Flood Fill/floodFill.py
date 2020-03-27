import queue

class floodFill:
    def solution(self, image, sr, sc, newColor):
        oldColor = image[sr][sc]
        if oldColor == newColor:
            return image
        dx = [-1, 1, 0, 0]
        dy = [0, 0, -1, 1]
        q = queue.Queue()
        q.put((sr,sc))
        width = len(image)
        length = len(image[0])
        while not q.empty():
            temp = q.get()
            x = temp[0]
            y = temp[1]
            image[x][y] = newColor
            for i in range(0, 4):
                r = x + dx[i]
                c = y + dy[i]
                if 0 <= r < width and 0 <= c < length and image[r][c] == oldColor:
                    q.put((r, c))
        return image

# img = [[1,1,1],[1,1,0],[1,0,1]]
img = [[0,0,0],[0,1,1]]
sr, sc, newColor = 1, 1, 1
obj = floodFill()
res = obj.solution(img, sr, sc, newColor)
print(res)