class Solution:
    def translateNum(self, num: int) -> int:
        strNum = str(num)
        strLen = len(strNum)
        if strLen == 1:
            return 1

        dp = [1] * (strLen + 1)
        for i in range(1, strLen):
            preSum = int(strNum[i - 1]) * 10 + int(strNum[i])
            if preSum < 26 and preSum != int(strNum[i]):
                dp[i + 1] = dp[i] + dp[i - 1]
            else:
                dp[i + 1] = dp[i]

        return dp[strLen]