class Solution:
    def trans(self, matrix):
        if not matrix:
            return []

        tMatrix = []
        for m in range(len(matrix[0]) - 1, -1, -1):
            temp = []
            for i in range(len(matrix)):
                temp.append(matrix[i][m])
            tMatrix.append(temp)
        return tMatrix

    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        res = []
        while matrix:
            res += matrix[0]
            matrix = self.trans(matrix[1:])
        return res