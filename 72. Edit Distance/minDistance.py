class minDistance:
    def solution(self, word1: str, word2: str) -> int:
        m = len(word1) + 1
        n = len(word2) + 1
        dp = [[0] * n for i in range(0, m)]
        for i in range(1, m):
            dp[i][0] = i
        for j in range(1, n):
            dp[0][j] = j
        for i in range(1, m):
            for j in range(1, n):
                if word1[i - 1] == word2[j - 1]:
                    dp[i][j] = dp[i - 1][j - 1]
                else:
                    dp[i][j] = min(dp[i - 1][j] + 1, dp[i][j - 1] + 1, dp[i - 1][j - 1] + 1)
        return dp[m - 1][n - 1]

word1 = ""
word2 = "execution"
obj = minDistance()
res = obj.solution(word1, word2)
print(res)