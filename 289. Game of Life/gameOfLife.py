class gameOfLife:
    def solution(self, board):
        width = len(board)
        length = len(board[0])
        if not width:
            return
        directions = [[-1, -1], [-1, 1], [-1, 0], [0, -1], [0, 1], [1, -1], [1, 0], [1, 1]]
        for i in range(0, width):
            for j in range(0, length):
                count = 0
                for k in range(0, 8):
                    x = i + directions[k][0]
                    y = j + directions[k][1]
                    if x < 0 or x >= width or y < 0 or y >= length:
                        continue
                    count = count + (board[x][y] & 1)
                if board[i][j] & 1:
                    if count >= 2 and count <= 3:
                        board[i][j] = 0b11
                elif count == 3:
                    board[i][j] = 0b10
        for i in range(0, width):
            for j in range(0, length):
                board[i][j] >>= 1
            print(board[i])

obj = gameOfLife()
arr = [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]
obj.solution(arr)