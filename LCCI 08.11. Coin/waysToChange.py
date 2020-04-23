class waysToChange:
    def solution(self, n: int) -> int:
        tokens = [1, 5, 10, 25]
        dp = [[0] * (n + 1) for _ in range(4)]
        
        for i in range(n + 1):
            dp[0][i] = 1
        for i in range(4):
            dp[i][0] = 1

        for i in range(1, 4):
            for j in range(1, n + 1):
                if j >= tokens[i]:
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - tokens[i]]) % 1000000007
                else:
                    dp[i][j] = dp[i - 1][j]
        return dp[3][n]


obj = waysToChange()
n = 5
res = obj.solution(n)
print(res)