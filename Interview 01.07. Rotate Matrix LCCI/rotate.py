class rotate:
    def solution(self, matrix) -> None:
        n = len(matrix)
        up = 0
        btn = n - 1
        while up < btn:
            temp = matrix[up]
            matrix[up] = matrix[btn]
            matrix[btn] = temp
            up = up + 1
            btn = btn - 1
        for i in range(0, n - 1):
            for j in range(i + 1, n):
                temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
obj = rotate()
m = [[1,2,3],[4,5,6],[7,8,9]]
obj.solution(m)
