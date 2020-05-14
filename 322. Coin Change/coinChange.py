class coinChange:
    def solution(self, coins: List[int], amount: int) -> int:
        dp = [amount + 1] * (amount + 1)
        dp[0] = 0
        for i in range(1, amount + 1):
            for c in coins:
                dp[i] = min(dp[i - c] + 1, dp[i]) if i - c >= 0 else dp[i]
        return dp[-1] if dp[-1] != amount + 1 else -1