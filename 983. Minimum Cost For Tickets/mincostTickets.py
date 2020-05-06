class mincostTickets:
    def solution(self, days: List[int], costs: List[int]) -> int:
        dp = [0] * (days[-1] + 1)
        for i in range(1, days[-1] + 1):
            if i not in days:
                dp[i] = dp[i - 1]
            else:
                if i - 7 < 0:
                    dp_7 = 0
                else:
                    dp_7 = dp[i - 7]
                if i - 30 < 0:
                    dp_30 = 0
                else:
                    dp_30 = dp[i - 30]
                dp[i] = min(dp[i - 1] + costs[0], dp_7 + costs[1], dp_30 + costs[2])
        return dp[-1]