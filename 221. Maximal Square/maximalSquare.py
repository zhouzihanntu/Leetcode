class maximalSquare:
    def solution(self, matrix: List[List[str]]) -> int:
        maxSide = 0
        if not matrix or len(matrix) == 0 or len(matrix[0]) == 0:
            return maxSide
        width = len(matrix)
        length = len(matrix[0])
        dp = [[0] * length for _ in range(width)]
        for i in range(width):
            for j in range(length):
                if matrix[i][j] == "1":
                    if i == 0 or j == 0:
                        dp[i][j] = 1
                    else:
                        dp[i][j] = min(dp[i - 1][j], dp[i][j - 1], dp[i - 1][j - 1]) + 1
                maxSide = max(maxSide, dp[i][j])
        return maxSide * maxSide
        