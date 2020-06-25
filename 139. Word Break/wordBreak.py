class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        if not s:
            return False
        if not wordDict:
            return False

        n = len(s)
        maxLen = len(wordDict[0])
        for word in wordDict:
            maxLen = max(maxLen, len(word))

        dp = [False] * (n + 1)
        dp[0] = True
        for i in range(1, n + 1):
            for j in range(max(i - maxLen, 0), i):
                if dp[j] and s[j : i] in wordDict:
                    dp[i] = True
                    break

        return dp[n]
        
