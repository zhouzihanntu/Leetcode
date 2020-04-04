class trap:
    def solution(self, height):
        n = len(height)
        if n == 0:
            return 0
        res = 0
        dp = [[0] * 2 for i in range(0, n)]
        dp[0][0] = height[0]
        dp[n - 1][1] = height[n - 1]
        for i in range(1, n):
            dp[i][0] = max(height[i], dp[i - 1][0])
        for i in range(n - 2, -1, -1):
            dp[i][1] = max(height[i], dp[i + 1][1])
        for i in range(1, n - 1):
            res = res + min(dp[i][0], dp[i][1]) - height[i]
        return res

arr = [0,1,0,2,1,0,1,3,2,1,2,1]
obj = trap()
res = obj.solution(arr)
print(res)
