class stoneGameIII:
    def solution(self, stoneValue) -> str:
        n = len(stoneValue)
        dp = [0] * (n + 2)
        Sum = stoneValue[n - 1]
        dp[n - 1] = stoneValue[n - 1]
        for i in range(n - 2, -1, -1):
            Sum = Sum + stoneValue[i]
            dp[i] = Sum - min(dp[i + 1], dp[i + 2], dp[i + 3])
        return "Tie" if dp[0] * 2 == Sum else ("Bob" if dp[0] * 2 < Sum else "Alice")


obj = stoneGameIII()
arr = [1,2,3,7]
res = obj.solution(arr)
print(res)