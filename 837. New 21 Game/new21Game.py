class Solution:
    def new21Game(self, N: int, K: int, W: int) -> float:
        dp = [0] * (K + W)
        s = 0
        for i in range(K, K + W):
            if i <= N:
                dp[i] = 1
            else:
                dp[i] = 0
            s += dp[i]
        
        for i in range(K - 1, -1, -1):
            dp[i] = s / W
            s = dp[i] + s - dp[i + W]
        return dp[0]