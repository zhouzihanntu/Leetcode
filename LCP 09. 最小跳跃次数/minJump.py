class minJump:
    def solution(self, jump: List[int]) -> int:
        size = len(jump)
        dp = [0] * size
        dp[-1] = 1
        for i in range(size - 1, -1, -1):
            if jump[i] + i >= size:
                dp[i] = 1
            else:
                dp[i] = 1 + dp[jump[i] + i]
            j = i + 1
            while (j < size - 1 and dp[j] >= dp[i] + 1):
                dp[j] = dp[i] + 1
                j = j + 1
        return dp[0]